package com.usha.rewards.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Default;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = Resource.class)
public class FamilyDetailsModel {

    @ValueMapValue
    @Default(values = "")
    private String memberName;

    @ValueMapValue
    @Default(values = "")
    private String relationship;

    @ValueMapValue
    @Default(values = "")
    private String dateOfBirth;

    @ValueMapValue
    @Default(values = "")
    private String contactNumber;

    @ValueMapValue
    @Default(values = "")
    private String emailAddress;

    public String getMemberName() {
        return memberName;
    }

    public String getRelationship() {
        return relationship;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
