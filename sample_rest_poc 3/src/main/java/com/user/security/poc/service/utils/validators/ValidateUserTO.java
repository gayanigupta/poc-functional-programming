package com.user.security.poc.service.utils.validators;

import com.user.security.poc.dto.UserTo;
import com.user.security.poc.exception.SecurityServiceErrorCode;
import com.user.security.poc.exception.SecurityServiceException;
import org.springframework.http.HttpStatus;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

public class ValidateUserTO {

    public static void validateUserTO(UserTo userTo){

        if(userTo == null){
            String[] errorKeys = {"userTo"};
            throw new SecurityServiceException(SecurityServiceErrorCode.MISSING_FIELD, HttpStatus.BAD_REQUEST.value(),
                    errorKeys, errorKeys);
        }
        if(StringUtils.isEmpty(userTo.getUsername())){
            String[] errorKeys = {"userName"};
            throw new SecurityServiceException(SecurityServiceErrorCode.MISSING_FIELD, HttpStatus.BAD_REQUEST.value(),
                    errorKeys, errorKeys);
        }

        if(StringUtils.isEmpty(userTo.getPassword())){
            String[] errorKeys = {"password"};
            throw new SecurityServiceException(SecurityServiceErrorCode.MISSING_FIELD, HttpStatus.BAD_REQUEST.value(),
                    errorKeys, errorKeys);
        }

        if(CollectionUtils.isEmpty(userTo.getRoles())){
            String[] errorKeys = {"roles"};
            throw new SecurityServiceException(SecurityServiceErrorCode.MISSING_FIELD, HttpStatus.BAD_REQUEST.value(),
                    errorKeys, errorKeys);
        }

    }
}
