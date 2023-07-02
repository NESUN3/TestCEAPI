import com.sap.gateway.ip.core.customdev.util.Message
import java.util.HashMap
def Message processData(Message message) {
    
    def body = message.getBody(java.lang.String)
    def messageLog = messageLogFactory.getMessageLog(message)
    if (messageLog != null) 
        messageLog.addAttachmentAsString('CE Response', body, 'text/xml')
    return message
    
}