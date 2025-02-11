package org.springframework.social.salesforce.api.impl.json;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.social.salesforce.api.Field;
import org.springframework.social.salesforce.api.RecordTypeInfo;
import org.springframework.social.salesforce.api.Relationship;

import java.util.List;

/**
 * {@see org.springframework.social.salesforce.api.SObjectDetail} Mixin for api v37.0.
 *
 * @author Umut Utkan
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class SObjectDetailMixin extends SObjectSummaryMixin {

    @JsonProperty("fields")
    List<Field> fields;

    @JsonProperty("childRelationships")
    List<Relationship> childRelationships;

    @JsonProperty("listviewable")
    boolean listviewable;

    @JsonProperty("lookupLayoutable")
    boolean lookupLayoutable;

    @JsonProperty("recordTypeInfos")
    List<RecordTypeInfo> recordTypeInfos;

    @JsonProperty("searchLayoutable")
    boolean searchLayoutable;

}
