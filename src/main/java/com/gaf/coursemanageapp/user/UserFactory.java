package com.gaf.coursemanageapp.user;

import com.gaf.coursemanageapp.constant.SystemConstant;

public class UserFactory {
    private  UserFactory(){

    }
    public static final BaseUser getUser(String userType) {
        switch (userType) {

            case SystemConstant
                    .ADMIN_ROLE:
                return new AdminUser();
            case SystemConstant
                    .TRAINEE_ROLE:
                return new TraineeUser();

            default:
                throw new IllegalArgumentException("This user type is unsupported");
        }
    }

}
