package io.quarkiverse.argocd.workflow.v1alpha1;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.Type;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GetUserInfoResponse  {

    private String email;
    private Boolean emailVerified;
    private List<String> groups;
    private String issuer;
    private String name;
    private String serviceAccountName;
    private String serviceAccountNamespace;
    private String subject;

    /**
    * Get email
    * @return email
    **/
    @JsonProperty("email")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getEmail() {
        return email;
    }

    /**
     * Set email
     **/
    public void setEmail(String email) {
        this.email = email;
    }

    public GetUserInfoResponse email(String email) {
        this.email = email;
        return this;
    }

    /**
    * Get emailVerified
    * @return emailVerified
    **/
    @JsonProperty("emailVerified")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Boolean getEmailVerified() {
        return emailVerified;
    }

    /**
     * Set emailVerified
     **/
    public void setEmailVerified(Boolean emailVerified) {
        this.emailVerified = emailVerified;
    }

    public GetUserInfoResponse emailVerified(Boolean emailVerified) {
        this.emailVerified = emailVerified;
        return this;
    }

    /**
    * Get groups
    * @return groups
    **/
    @JsonProperty("groups")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public List<String> getGroups() {
        return groups;
    }

    /**
     * Set groups
     **/
    public void setGroups(List<String> groups) {
        this.groups = groups;
    }

    public GetUserInfoResponse groups(List<String> groups) {
        this.groups = groups;
        return this;
    }
    public GetUserInfoResponse addGroupsItem(String groupsItem) {
        if (this.groups == null){
            groups = new ArrayList<>();
        }
        this.groups.add(groupsItem);
        return this;
    }

    /**
    * Get issuer
    * @return issuer
    **/
    @JsonProperty("issuer")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getIssuer() {
        return issuer;
    }

    /**
     * Set issuer
     **/
    public void setIssuer(String issuer) {
        this.issuer = issuer;
    }

    public GetUserInfoResponse issuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
    * Get name
    * @return name
    **/
    @JsonProperty("name")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getName() {
        return name;
    }

    /**
     * Set name
     **/
    public void setName(String name) {
        this.name = name;
    }

    public GetUserInfoResponse name(String name) {
        this.name = name;
        return this;
    }

    /**
    * Get serviceAccountName
    * @return serviceAccountName
    **/
    @JsonProperty("serviceAccountName")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getServiceAccountName() {
        return serviceAccountName;
    }

    /**
     * Set serviceAccountName
     **/
    public void setServiceAccountName(String serviceAccountName) {
        this.serviceAccountName = serviceAccountName;
    }

    public GetUserInfoResponse serviceAccountName(String serviceAccountName) {
        this.serviceAccountName = serviceAccountName;
        return this;
    }

    /**
    * Get serviceAccountNamespace
    * @return serviceAccountNamespace
    **/
    @JsonProperty("serviceAccountNamespace")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getServiceAccountNamespace() {
        return serviceAccountNamespace;
    }

    /**
     * Set serviceAccountNamespace
     **/
    public void setServiceAccountNamespace(String serviceAccountNamespace) {
        this.serviceAccountNamespace = serviceAccountNamespace;
    }

    public GetUserInfoResponse serviceAccountNamespace(String serviceAccountNamespace) {
        this.serviceAccountNamespace = serviceAccountNamespace;
        return this;
    }

    /**
    * Get subject
    * @return subject
    **/
    @JsonProperty("subject")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getSubject() {
        return subject;
    }

    /**
     * Set subject
     **/
    public void setSubject(String subject) {
        this.subject = subject;
    }

    public GetUserInfoResponse subject(String subject) {
        this.subject = subject;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetUserInfoResponse {\n");

        sb.append("    email: ").append(toIndentedString(email)).append("\n");
        sb.append("    emailVerified: ").append(toIndentedString(emailVerified)).append("\n");
        sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
        sb.append("    issuer: ").append(toIndentedString(issuer)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    serviceAccountName: ").append(toIndentedString(serviceAccountName)).append("\n");
        sb.append("    serviceAccountNamespace: ").append(toIndentedString(serviceAccountNamespace)).append("\n");
        sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private static String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class GetUserInfoResponseQueryParam  {

        @jakarta.ws.rs.QueryParam("email")
        private String email;
        @jakarta.ws.rs.QueryParam("emailVerified")
        private Boolean emailVerified;
        @jakarta.ws.rs.QueryParam("groups")
        private List<String> groups = null;
        @jakarta.ws.rs.QueryParam("issuer")
        private String issuer;
        @jakarta.ws.rs.QueryParam("name")
        private String name;
        @jakarta.ws.rs.QueryParam("serviceAccountName")
        private String serviceAccountName;
        @jakarta.ws.rs.QueryParam("serviceAccountNamespace")
        private String serviceAccountNamespace;
        @jakarta.ws.rs.QueryParam("subject")
        private String subject;

        /**
        * Get email
        * @return email
        **/
        @JsonProperty("email")
        public String getEmail() {
            return email;
        }

        /**
         * Set email
         **/
        public void setEmail(String email) {
            this.email = email;
        }

        public GetUserInfoResponseQueryParam email(String email) {
            this.email = email;
            return this;
        }

        /**
        * Get emailVerified
        * @return emailVerified
        **/
        @JsonProperty("emailVerified")
        public Boolean getEmailVerified() {
            return emailVerified;
        }

        /**
         * Set emailVerified
         **/
        public void setEmailVerified(Boolean emailVerified) {
            this.emailVerified = emailVerified;
        }

        public GetUserInfoResponseQueryParam emailVerified(Boolean emailVerified) {
            this.emailVerified = emailVerified;
            return this;
        }

        /**
        * Get groups
        * @return groups
        **/
        @JsonProperty("groups")
        public List<String> getGroups() {
            return groups;
        }

        /**
         * Set groups
         **/
        public void setGroups(List<String> groups) {
            this.groups = groups;
        }

        public GetUserInfoResponseQueryParam groups(List<String> groups) {
            this.groups = groups;
            return this;
        }
        public GetUserInfoResponseQueryParam addGroupsItem(String groupsItem) {
            this.groups.add(groupsItem);
            return this;
        }

        /**
        * Get issuer
        * @return issuer
        **/
        @JsonProperty("issuer")
        public String getIssuer() {
            return issuer;
        }

        /**
         * Set issuer
         **/
        public void setIssuer(String issuer) {
            this.issuer = issuer;
        }

        public GetUserInfoResponseQueryParam issuer(String issuer) {
            this.issuer = issuer;
            return this;
        }

        /**
        * Get name
        * @return name
        **/
        @JsonProperty("name")
        public String getName() {
            return name;
        }

        /**
         * Set name
         **/
        public void setName(String name) {
            this.name = name;
        }

        public GetUserInfoResponseQueryParam name(String name) {
            this.name = name;
            return this;
        }

        /**
        * Get serviceAccountName
        * @return serviceAccountName
        **/
        @JsonProperty("serviceAccountName")
        public String getServiceAccountName() {
            return serviceAccountName;
        }

        /**
         * Set serviceAccountName
         **/
        public void setServiceAccountName(String serviceAccountName) {
            this.serviceAccountName = serviceAccountName;
        }

        public GetUserInfoResponseQueryParam serviceAccountName(String serviceAccountName) {
            this.serviceAccountName = serviceAccountName;
            return this;
        }

        /**
        * Get serviceAccountNamespace
        * @return serviceAccountNamespace
        **/
        @JsonProperty("serviceAccountNamespace")
        public String getServiceAccountNamespace() {
            return serviceAccountNamespace;
        }

        /**
         * Set serviceAccountNamespace
         **/
        public void setServiceAccountNamespace(String serviceAccountNamespace) {
            this.serviceAccountNamespace = serviceAccountNamespace;
        }

        public GetUserInfoResponseQueryParam serviceAccountNamespace(String serviceAccountNamespace) {
            this.serviceAccountNamespace = serviceAccountNamespace;
            return this;
        }

        /**
        * Get subject
        * @return subject
        **/
        @JsonProperty("subject")
        public String getSubject() {
            return subject;
        }

        /**
         * Set subject
         **/
        public void setSubject(String subject) {
            this.subject = subject;
        }

        public GetUserInfoResponseQueryParam subject(String subject) {
            this.subject = subject;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class GetUserInfoResponseQueryParam {\n");

            sb.append("    email: ").append(toIndentedString(email)).append("\n");
            sb.append("    emailVerified: ").append(toIndentedString(emailVerified)).append("\n");
            sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
            sb.append("    issuer: ").append(toIndentedString(issuer)).append("\n");
            sb.append("    name: ").append(toIndentedString(name)).append("\n");
            sb.append("    serviceAccountName: ").append(toIndentedString(serviceAccountName)).append("\n");
            sb.append("    serviceAccountNamespace: ").append(toIndentedString(serviceAccountNamespace)).append("\n");
            sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
            sb.append("}");
            return sb.toString();
        }

        /**
         * Convert the given object to string with each line indented by 4 spaces
         * (except the first line).
         */
        private static String toIndentedString(Object o) {
            if (o == null) {
                return "null";
            }
            return o.toString().replace("\n", "\n    ");
        }
    }
}