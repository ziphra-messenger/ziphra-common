package ar.ziphra.common.enumeration;

public enum ProtocoloActionsEnum {

	//PROTOCOLO_COMPONENT_REQUEST_ID("//PROTOCOLO_COMPONENT_REQUEST_ID"),
	/*"olds"*/
	//PROTOCOLO_COMPONENT_AUTH("//PROTOCOLO_COMPONENT_AUTH"),
	//PROTOCOLO_COMPONENT_ENCRYPT_KEYS("//PROTOCOLO_COMPONENT_ENCRYPT_KEYS"),
	//PROTOCOLO_COMPONENT_GRUPO("//PROTOCOLO_COMPONENT_GRUPO"),
	//PROTOCOLO_COMPONENT_MESSAGE("//PROTOCOLO_COMPONENT_MESSAGE"),
	//PROTOCOLO_COMPONENT_MY_ACCOUNT("//PROTOCOLO_COMPONENT_MY_ACCOUNT"),
	//PROTOCOLO_COMPONENT_PRIVACITY_RSA("//PROTOCOLO_COMPONENT_PRIVACITY_RSA"),
	//PROTOCOLO_COMPONENT_SERVER_CONF_UNSECURE("//PROTOCOLO_COMPONENT_SERVER_CONF_UNSECURE"),
	//GRUPO_GRAL_CONF_SAVE_LOCK("GRUPO_GRAL_CONF_SAVE_LOCK"),
	AUTH_LOGIN("AUTH_LOGIN"),
	AUTH_REGISTER("AUTH_REGISTER"),
	AUTH_VALIDATE_USERNAME("AUTH_VALIDATE_USERNAME"),
	ENCRYPT_KEYS_CREATE("ENCRYPT_KEYS_CREATE"),
	ENCRYPT_KEYS_GET("ENCRYPT_KEYS_GET"),
	GRUPO_ACCEPT_INVITATION("GRUPO_ACCEPT_INVITATION"),
	GRUPO_CHANGE_USER_ROLE("GRUPO_CHANGE_USER_ROLE"),
	GRUPO_CHANGE_USER_ROLE_OUTPUT("GRUPO_CHANGE_USER_ROLE_OUTPUT"),
	
	GRUPO_ADDUSER_ADDME("GRUPO_ADDUSER_ADDME"),
	GRUPO_BLOCK_REMOTO("GRUPO_BLOCK_REMOTO"),
	GRUPO_DELETE("GRUPO_DELETE"),
	GRUPO_GET_GRUPO_BY_ID("GRUPO_GET_GRUPO_BY_ID"),
	GRUPO_GET_GRUPO_BY_IDS("GRUPO_GET_GRUPO_BY_IDS"),
	GRUPO_GET_IDS_MY_GRUPOS("GRUPO_GET_IDS_MY_GRUPOS"),
	GRUPO_HOW_MANY_MEMBERS_ONLINE("GRUPO_HOW_MANY_MEMBERS_ONLINE"),
	GRUPO_INVITATION_RECIVED("GRUPO_INVITATION_RECIVED"),
	GRUPO_LIST_MEMBERS("GRUPO_LIST_MEMBERS"),
	GRUPO_LIST_MY_GRUPOS("GRUPO_LIST_MY_GRUPOS"),
	GRUPO_LOGIN("GRUPO_LOGIN"),
	GRUPO_NEW_GRUPO("GRUPO_NEW_GRUPO"),
	GRUPO_REMOVE_ME("GRUPO_REMOVE_ME"),
	GRUPO_REMOVE_OTHER("GRUPO_REMOVE_OTHER"),
	GRUPO_SAVE_GENERAL_CONFIGURATION("GRUPO_SAVE_GENERAL_CONFIGURATION"),
	GRUPO_SAVE_GENERAL_CONFIGURATION_LOCK("GRUPO_SAVE_GENERAL_CONFIGURATION_LOCK"),
	GRUPO_SAVE_GRAL_CONF_PASSWORD("GRUPO_SAVE_GRAL_CONF_PASSWORD"),
	GRUPO_SAVE_GRUPO_USER_CONF("GRUPO_SAVE_GRUPO_USER_CONF"),
	GRUPO_SAVE_NICKNAME("GRUPO_SAVE_NICKNAME"),
	GRUPO_SENT_INVITATION("GRUPO_SENT_INVITATION"),
	GRUPO_STOP_WRITTING("GRUPO_STOP_WRITTING"),
	GRUPO_UPDATE_GRUPO("GRUPO_UPDATE_GRUPO"),
	GRUPO_WRITTING("GRUPO_WRITTING"),
	MESSAGE_CHANGE_STATE("MESSAGE_CHANGE_STATE"),
	MESSAGE_DELETE_FOR_EVERYONE("MESSAGE_DELETE_FOR_EVERYONE"),
	MESSAGE_DELETE_FOR_ME("MESSAGE_DELETE_FOR_ME"),
	MESSAGE_EMPTY_LIST("MESSAGE_EMPTY_LIST"),
	MESSAGE_GET_ALL_ID_MESSAGE_UNREAD("MESSAGE_GET_ALL_ID_MESSAGE_UNREAD"),
	MESSAGE_GET_ALL_ID_MESSAGE_DESTINY_SERVER("MESSAGE_GET_ALL_ID_MESSAGE_DESTINY_SERVER"),
	
	MESSAGE_GET_ID_HISTORIAL("MESSAGE_GET_ID_HISTORIAL"),
	MESSAGE_GET_LOAD_MESSAGES("MESSAGE_GET_LOAD_MESSAGES"),
	MESSAGE_GET_MEDIA_1("MESSAGE_GET_MEDIA_1"),
	MESSAGE_GET_MEDIA_2("MESSAGE_GET_MEDIA_2"),
	MESSAGE_GET_MESSAGE("MESSAGE_GET_MESSAGE"),
	MESSAGE_RECIVIED("MESSAGE_RECIVIED"),
	MESSAGE_SEND("MESSAGE_SEND"),
	MY_ACCOUNT_CLOSE_SESSION("MY_ACCOUNT_CLOSE_SESSION"),
	MY_ACCOUNT_INVITATION_CODE_GENERATOR("MY_ACCOUNT_INVITATION_CODE_GENERATOR"),
	MY_ACCOUNT_IS_INVITATION_CODE_AVAILABLE("MY_ACCOUNT_IS_INVITATION_CODE_AVAILABLE"),
	MY_ACCOUNT_SAVE_CODE_AVAILABLE("MY_ACCOUNT_SAVE_CODE_AVAILABLE"),
	MY_ACCOUNT_SAVE_GENERAL_CONFIGURATION("MY_ACCOUNT_SAVE_GENERAL_CONFIGURATION"),
	MY_ACCOUNT_SAVE_LOCK("MY_ACCOUNT_SAVE_LOCK"),
	MY_ACCOUNT_SAVE_LOGIN_SKIP("MY_ACCOUNT_SAVE_LOGIN_SKIP"),
	MY_ACCOUNT_SAVE_NICKNAME("MY_ACCOUNT_SAVE_NICKNAME"),
	MY_ACCOUNT_SAVE_PASSWORD("MY_ACCOUNT_SAVE_PASSWORD"),
	PING_ACTION("PING ACTION"),
	PRIVACITY_RSA_GET_PUBLIC_KEY("PRIVACITY_RSA_GET_PUBLIC_KEY"),
	REQUEST_ID_PRIVATE_GET("REQUEST_ID_PRIVATE_GET"),
	REQUEST_ID_PUBLIC_GET("REQUEST_ID_PUBLIC_GET"),
	SERVER_CONF_UNSECURE_GET_GRAL_CONF("SERVER_CONF_UNSECURE_GET_GRAL_CONF"),
	SERVER_CONF_UNSECURE_GET_TIME("SERVER_CONF_UNSECURE_GET_TIME"),
	SERVER_NOT_AVAILABLE("SERVER_NOT_AVAILABLE");








	
	private final String name;       

	private ProtocoloActionsEnum(String s) {
		name = s;
	}

	public boolean equalsName(String otherName) {
		// (otherName == null) check is not needed because name.equals(null) returns false 
		return name.equals(otherName);
	}

	public String toString() {
		return this.name;
	}
}
