
# Client

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | An identifier for the client. Must be globally unique. | 
**active** | **Boolean** | Flag indicating if the client is active. |  [optional]
**lastSeen** | **String** | The date time the client was last seen. |  [optional]
**platform** | **String** | The client&#39;s platform. | 
**pushNotificationToken** | **String** | The GCM or APN token to be used for sending push notifications to the device. Applies to only *android* and *ios* clients.  |  [optional]
**appVersion** | **String** | A reserved string field for reporting the app version running on the device. |  [optional]
**displayName** | **String** | The client&#39;s display name. |  [optional]
**info** | [**ClientInfo**](ClientInfo.md) |  |  [optional]



