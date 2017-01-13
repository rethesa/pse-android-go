package com.example.androidgoapp.androidgoapp.Controler.GroupUserAppointment;

import com.example.androidgoapp.androidgoapp.Controler.Database.ServiceAllocation;
import com.example.androidgoapp.androidgoapp.Controler.Database.ServiceUser;
import com.example.androidgoapp.androidgoapp.Model.GroupUserAppointment.UserDecorator;

/**
 * hält Informationen darüber wer ich bin
 */

public class AccountHandler {

    /**
     * Register a new user. Create a new user object and also save the device id, that not one
     * user can make infinite accounts. Just one account per device id.
     * @param userName
     * @param deviceID
     */
    public void registerUser(String userName, String deviceID) {
        //TODO
    }

    /**
     * Deletes a user in user.db and also deletes all allocations between this user and all his
     * groups.
     * @param user to be deleted.
     */
    public void deleteUserAccount(UserDecorator user) {
        ServiceUser sUser = null;
        sUser.deleteUser(user.getUserID());
        ServiceAllocation sAlloc = null;
        sAlloc.deleteAllMemberGroupAlloc(user.getUserID());
        //public boolean delteUserInAllGrou
        //TODO
    }

}
