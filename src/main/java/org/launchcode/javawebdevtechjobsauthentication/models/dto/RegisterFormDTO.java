package org.launchcode.javawebdevtechjobsauthentication.models.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class RegisterFormDTO extends LoginFormDTO {

    @NotBlank
    @NotNull
    @Size(min=6, max=30, message="Invalid password; must be between 6 and 30 characters.")
    private String verifyPassword;

    public String getVerifyPassword() { return verifyPassword; }
    public void setVerifyPassword(String verifyPassword) { this.verifyPassword = verifyPassword; }
}
