package org.springframework.social.salesforce.api.impl.json;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;

/**
 * {@see org.springframework.social.salesforce.api.SObjectSummary} Mixin for api v37.0.
 *
 * @author Umut Utkan
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class SObjectSummaryMixin {

    @JsonProperty("name")
    String name;

    @JsonProperty("label")
    String label;

    @JsonProperty("updateable")
    boolean updateable;

    @JsonProperty("keyPrefix")
    String keyPrefix;

    @JsonProperty("custom")
    boolean custom;

    @JsonProperty("urls")
    Map<String, String> urls;

    @JsonProperty("searchable")
    boolean searchable;

    @JsonProperty("labelPlural")
    String labelPlural;

    @JsonProperty("layaoutable")
    boolean layoutable;

    @JsonProperty("activateable")
    boolean activateable;

    @JsonProperty("createable")
    boolean createable;

    @JsonProperty("deprecatedAndHidded")
    boolean deprecatedAndHidden;

    @JsonProperty("customSetting")
    boolean customSetting;

    @JsonProperty("deletable")
    boolean deletable;

    @JsonProperty("feedEnabled")
    boolean feedEnabled;

    @JsonProperty("mergeable")
    boolean mergeable;

    @JsonProperty("queryable")
    boolean queryable;

    @JsonProperty("replicateable")
    boolean replicateable;

    @JsonProperty("retrieveable")
    boolean retrieveable;

    @JsonProperty("undeletable")
    boolean undeletable;

    @JsonProperty("triggerable")
    boolean triggerable;


}
