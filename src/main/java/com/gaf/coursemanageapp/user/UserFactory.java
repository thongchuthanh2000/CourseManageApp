package com.gaf.coursemanageapp.user;

import com.gaf.coursemanageapp.constant.SystemConstant;
import org.hibernate.usertype.UserType;

public class UserFactory {
    private  UserFactory(){

    }
    public static final BaseUser getUser(String userType) {
        switch (userType) {

            case SystemConstant
                    .ADMIN_ROLE:
                return new Admin();
            case SystemConstant
                    .TRAINEE_ROLE:
                return new Trainee();

            default:
                throw new IllegalArgumentException("This user type is unsupported");
        }
    }

}
