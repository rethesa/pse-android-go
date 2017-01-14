package com.example.androidgoapp.androidgoapp.controller.objectStructure;

import com.example.androidgoapp.androidgoapp.controller.database.ServiceAllocation;
import com.example.androidgoapp.androidgoapp.controller.database.ServiceUser;
import com.example.androidgoapp.androidgoapp.model.objectStructure.UserDecoratorClient;

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
    public void deleteUserAccount(UserDecoratorClient user) {
        ServiceUser sUser = null;
        sUser.deleteUser(user.getUserID());
        ServiceAllocation sAlloc = null;
        sAlloc.deleteAllMemberGroupAlloc(user.getUserID());
        //public boolean delteUserInAllGrou
        //TODO
    }

}
