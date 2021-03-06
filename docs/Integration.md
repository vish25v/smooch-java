
# Integration

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The integration ID, generated automatically. | 
**type** | **String** | The integration type. | 
**pageAccessToken** | **String** | Facebook Page Access Token. Required for *messenger* integrations.  |  [optional]
**appId** | **String** | Facebook App ID OR WeChat App ID. Required for *messenger* and *wechat* integrations.  |  [optional]
**appSecret** | **String** | Facebook Page App Secret OR WeChat App Secret. Required for *messenger* and *wechat* integrations.  |  [optional]
**webhookSecret** | **String** | Secret to verify webhooks. Returned on successful *wechat* and *messagebird* integrations.  |  [optional]
**pageId** | **String** | Facebook Page App ID. Returned on successful *messenger* integrations.  |  [optional]
**accountSid** | **String** | Twilio Account SID. Required for *twilio* integrations.  |  [optional]
**authToken** | **String** | Twilio Auth Token. Required for *twilio* integrations.  |  [optional]
**phoneNumberSid** | **String** | SID for specific phone number. Required for *twilio* integrations.  |  [optional]
**phoneNumber** | **String** | Smooch will receive all messages sent to this phone number. Returned on successful *twilio* integrations.  |  [optional]
**name** | **String** | Name on the account. Returned on successful *twilio* integrations.  |  [optional]
**token** | **String** | Telegram Bot Token OR Viber Public Account token. Required for *twilio* and *viber* integrations.  |  [optional]
**uri** | **String** | The viber URI to find the account. Returned on successful *viber* integrations.  |  [optional]
**channelAccessToken** | **String** | LINE Channel Access Token. Required for *line* integrations.  |  [optional]
**botName** | **String** | The bot&#39;s name. Returned on successful *line* integrations.  |  [optional]
**encodingAesKey** | **String** | AES Encoding Key. (Optional) Used for *wechat* integrations.  |  [optional]
**fromAddress** | **String** | Email will display as coming from this address. (Optional) Used for *frontendEmail* integrations.  |  [optional]
**certificate** | **String** | The binary of your APN certificate base64 encoded. Required for *apn* integrations.  |  [optional]
**password** | **String** | The password for your APN certificate. (Optional) Used for *apn* integrations.  |  [optional]
**autoUpdateBadge** | **Boolean** | Use the unread count of the conversation as the application badge. (Optional) Used for *apn* integrations.  |  [optional]
**production** | **Boolean** | Flag specifying whether the certificate is production. Returned on successful *apn* integrations.  |  [optional]
**serverKey** | **String** | Your server key from the fcm console. Required for *fcm* integrations.  |  [optional]
**senderId** | **String** | Your sender id from the fcm console. Required for *fcm* integrations.  |  [optional]
**consumerKey** | **String** | The consumer key for your Twitter app. Required for *twitter* integrations.  |  [optional]
**consumerSecret** | **String** | The consumer secret for your Twitter app. Required for *twitter* integrations.  |  [optional]
**accessTokenKey** | **String** | The access token key obtained from your user via oauth. Required for *twitter* integrations.  |  [optional]
**accessTokenSecret** | **String** | The access token secret obtained from your user via oauth. Required for *twitter* integrations.  |  [optional]
**userId** | **String** | The twitter userId. Returned on successful *twitter* integrations.  |  [optional]
**username** | **String** | The username for the account. Returned on successful *twitter* and *telegram* integrations.  |  [optional]
**apiKey** | **String** | The public API key of your Mailgun account. Required for *mailgun* integrations.  |  [optional]
**domain** | **String** | The domain used to relay email. Required for *mailgun* integrations.  |  [optional]
**incomingAddress** | **String** | Smooch will receive all emails sent to this address. Required for *mailgun* integrations.  |  [optional]
**accessKey** | **String** | The public API key of your MessageBird account. Required for *messagebird* integrations.  |  [optional]
**originator** | **String** | Smooch will receive all messages sent to this phone number. Required for *messagebird* integrations.  |  [optional]



