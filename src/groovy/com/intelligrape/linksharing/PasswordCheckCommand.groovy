package com.intelligrape.linksharing

import com.intelligrape.linksharing.User
import grails.validation.Validateable

@Validateable
class PasswordCheckCommand {
    String password
    String confirmPassword
    User user

    static constraints = {
        password blank: false
        confirmPassword blank: false, validator: { val, obj ->
            if (!val.equals(obj.password)) {
                return false
            }
        }
    }
}
