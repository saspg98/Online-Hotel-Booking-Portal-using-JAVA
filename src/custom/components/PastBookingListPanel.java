/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package custom.components;

import internal.Booking;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author Sarthak
 */
public class PastBookingListPanel extends javax.swing.JPanel {

    public static final String WAIT_LIST = "wait";
    public static final String CONFIRMED = "conf";
    public static final String PREVIOUS = "previous";

    private final Booking thisBooking;
    private final ActionListener actionListener;
   
    
    /**
     * Creates new form PastBookingListPanel
     */
    //DELETE THIS CONSTRUCTOR
    public PastBookingListPanel() {
        initComponents();
        System.out.println("Error Incomming: Empty Const of PastBookingListPanel Called! Setting thisBooking to null");
        thisBooking = null;
        actionListener = null;

    }

    public PastBookingListPanel(Booking booking, String typeOfPanel, ActionListener a) {
        initComponents();
        thisBooking = booking;
        actionListener = a;
 
        
        checkInLabel.setText(booking.getCheckIn().toString());
        checkOutLabel.setText(booking.getCheckOut().toString());
        guestLabel.setText(String.valueOf(booking.getNumPeople())+" Guests");
        hotelNameLabel.setText(booking.getHotelName() + "(#"+booking.getBookingReference()+")");
        roomLabel.setText(booking.getNumRooms()+" Rooms");
        roomTypeLabel.setText(booking.getRoomType());
        
        updateButton.addActionListener(actionListener);
        cancelButton.addActionListener(actionListener);

        if (typeOfPanel.equals(PREVIOUS)) {
            setStateToPrevious();

        } else if (typeOfPanel.equals(WAIT_LIST)) {
            setStateToWaitlist();
        }

    }

    private void setStateToPrevious() {
        
        remove(cancelButton);
        GridBagConstraints gbc = new GridBagConstraints();
        ratingPanel = new RatingPanel();
        gbc.gridx = 3;
        gbc.gridy = 0;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.insets = new java.awt.Insets(5, 10, 5, 10);
        add(ratingPanel, gbc);

        updateButton.setText("Submit");
        updateButton.setActionCommand(SUBMIT_RATING);
    }

    private void setStateToWaitlist() {
        cancelButton.setText("Cancel Waitlist");
        updateButton.setBackground(BOOK_COLOR);
        updateButton.setText("Book Now");
        updateButton.setActionCommand(BOOK_WAITLIST);
    }
    
    
    public final String BOOK_WAITLIST = "Book Wait List";
    public final String SUBMIT_RATING = "submit rating";
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        hotelNameLabel = new javax.swing.JLabel();
        checkInLabel = new javax.swing.JLabel();
        checkOutLabel = new javax.swing.JLabel();
        guestLabel = new javax.swing.JLabel();
        updateButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        roomTypeLabel = new javax.swing.JLabel();
        roomLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(25, 25, 25));
        setBorder(javax.swing.BorderFactory.createMatteBorder(2, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        setLayout(new java.awt.GridBagLayout());

        hotelNameLabel.setFont(new java.awt.Font("Lato Black", 0, 28)); // NOI18N
        hotelNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        hotelNameLabel.setText("Hotel Name(#23212)");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.weightx = 5.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        add(hotelNameLabel, gridBagConstraints);

        checkInLabel.setFont(new java.awt.Font("Lato Black", 0, 24)); // NOI18N
        checkInLabel.setForeground(new java.awt.Color(255, 255, 255));
        checkInLabel.setText("checkin date");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        add(checkInLabel, gridBagConstraints);

        checkOutLabel.setFont(new java.awt.Font("Lato Black", 0, 24)); // NOI18N
        checkOutLabel.setForeground(new java.awt.Color(255, 255, 255));
        checkOutLabel.setText("checkout date");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        add(checkOutLabel, gridBagConstraints);

        guestLabel.setFont(new java.awt.Font("Lato Black", 0, 24)); // NOI18N
        guestLabel.setForeground(new java.awt.Color(255, 255, 255));
        guestLabel.setText("3 guests");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        add(guestLabel, gridBagConstraints);

        updateButton.setBackground(new java.awt.Color(59, 35, 59));
        updateButton.setFont(new java.awt.Font("Lato Black", 0, 24)); // NOI18N
        updateButton.setForeground(new java.awt.Color(255, 255, 255));
        updateButton.setText("Modify");
        updateButton.setContentAreaFilled(false);
        updateButton.setOpaque(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 5, 10);
        add(updateButton, gridBagConstraints);

        cancelButton.setBackground(new java.awt.Color(59, 35, 59));
        cancelButton.setFont(new java.awt.Font("Lato Black", 0, 24)); // NOI18N
        cancelButton.setForeground(new java.awt.Color(255, 255, 255));
        cancelButton.setText("Cancel Booking");
        cancelButton.setContentAreaFilled(false);
        cancelButton.setOpaque(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 5, 10);
        add(cancelButton, gridBagConstraints);

        roomTypeLabel.setFont(new java.awt.Font("Lato Black", 0, 24)); // NOI18N
        roomTypeLabel.setForeground(new java.awt.Color(255, 255, 255));
        roomTypeLabel.setText("Executive");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        add(roomTypeLabel, gridBagConstraints);

        roomLabel.setFont(new java.awt.Font("Lato Black", 0, 24)); // NOI18N
        roomLabel.setForeground(new java.awt.Color(255, 255, 255));
        roomLabel.setText("checkout date");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        add(roomLabel, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private static final Color BOOK_COLOR = new Color(0, 140, 0);
    private RatingPanel ratingPanel;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelButton;
    private javax.swing.JLabel checkInLabel;
    private javax.swing.JLabel checkOutLabel;
    private javax.swing.JLabel guestLabel;
    private javax.swing.JLabel hotelNameLabel;
    private javax.swing.JLabel roomLabel;
    private javax.swing.JLabel roomTypeLabel;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
}
