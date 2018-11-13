/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package internal;

import custom.components.GuestRoomDialogPanel;
import custom.components.ModifyBookingDialogPanel;
import static custom.components.GuestRoomDialogPanel.G_UPDATE;
import static custom.components.GuestRoomDialogPanel.G_CANCEL;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static custom.components.ModifyBookingDialogPanel.B_UPDATE;
import static custom.components.ModifyBookingDialogPanel.B_CANCEL;
import javax.swing.JDialog;
import javax.swing.SwingUtilities;

/**
 *
 * @author Sarthak
 */
public class DialogActionListener implements ActionListener {
    
    GuestRoomDialogPanel guest;
    ModifyBookingDialogPanel book;

    public DialogActionListener(GuestRoomDialogPanel guest, ModifyBookingDialogPanel book) {
        this.guest = guest;
        this.book = book;
        
        this.guest.setActionListener(this);
        this.book.setActionListener(this);
    }


    
    
    
    
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
       switch(e.getActionCommand()){
           case B_UPDATE:
               BookedRooms old =book.getBooking();
               BookedRooms newR;//get from ModifyBookingPanel
                
               ((JDialog)SwingUtilities.getAncestorOfClass(JDialog.class, book)).dispose();//Add null check!
               System.out.println("DO NULL CHECK");
               break;
            case B_CANCEL:
                //dispose dialogBox(create public method in MainForm)
               ((JDialog)SwingUtilities.getAncestorOfClass(JDialog.class, book)).dispose();//Add null check!
               System.out.println("DO NULL CHECK");
               break;
            case G_UPDATE:
                //update booking object>refresh details>dispose dialog
                
                
                ((JDialog)SwingUtilities.getAncestorOfClass(JDialog.class, guest)).dispose();//Add null check!
               System.out.println("DO NULL CHECK");
               break;
            case G_CANCEL:
                //dispose dialog
                
               ((JDialog)SwingUtilities.getAncestorOfClass(JDialog.class, guest)).dispose();//Add null check!
               System.out.println("DO NULL CHECK");
               break;
       }
        
    }
    
}