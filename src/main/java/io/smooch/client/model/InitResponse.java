/*
 * Smooch
 * The Smooch API is a unified interface for powering messaging in your customer experiences across every channel. Our API speeds access to new markets, reduces time to ship, eliminates complexity, and helps you build the best experiences for your customers. For more information, visit our [official documentation](https://docs.smooch.io).
 *
 * OpenAPI spec version: 1.11
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.smooch.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.smooch.client.model.App;
import io.smooch.client.model.AppUser;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * InitResponse
 */

public class InitResponse {
  @SerializedName("appUser")
  private AppUser appUser = null;

  @SerializedName("app")
  private App app = null;

  public InitResponse appUser(AppUser appUser) {
    this.appUser = appUser;
    return this;
  }

   /**
   * The app user.
   * @return appUser
  **/
  @ApiModelProperty(required = true, value = "The app user.")
  public AppUser getAppUser() {
    return appUser;
  }

  public void setAppUser(AppUser appUser) {
    this.appUser = appUser;
  }

  public InitResponse app(App app) {
    this.app = app;
    return this;
  }

   /**
   * The app.
   * @return app
  **/
  @ApiModelProperty(required = true, value = "The app.")
  public App getApp() {
    return app;
  }

  public void setApp(App app) {
    this.app = app;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InitResponse initResponse = (InitResponse) o;
    return Objects.equals(this.appUser, initResponse.appUser) &&
        Objects.equals(this.app, initResponse.app);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appUser, app);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitResponse {\n");
    
    sb.append("    appUser: ").append(toIndentedString(appUser)).append("\n");
    sb.append("    app: ").append(toIndentedString(app)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}

