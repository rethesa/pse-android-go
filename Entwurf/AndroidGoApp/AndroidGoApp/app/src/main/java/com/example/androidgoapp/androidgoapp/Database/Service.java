package com.example.androidgoapp.androidgoapp.Database;

/**
 * Created by Theresa on 11.01.2017.
 */

public interface Service {

    /**
     * Delete user.
     * @param id
     * @return
     */
    public boolean deleteData(int id);

    /**
     * Update inforamtion about user.
     * @param id
     * @return
     */
    public boolean updateData(int id);
}
