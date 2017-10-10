package com.vip.saturn.job.console.utils;

/**
 * 
 * @author hebelala
 *
 */
public class SessionAttributeKeys {

	public static final String ACTIVATED_CONFIG_SESSION_KEY = "activated_config";
	public static final String CURRENT_ZK_CLUSTER_KEY = "current_zk_cluster_key";
	public static final String LAST_VISIT_URL = "last_visit_url";
	public static final String LOGIN_USER_NAME = "login_user_name";
	public static final String LOGIN_USER_OA_NAME = "login_user_oa_name";
	public static final String MOVE_NAMESPACE_BATCH_STATUS_PREFIX = "move_namespace_batch_status_prefix";

	public static String getMoveNamespaceBatchStatusKey(long id) {
		return MOVE_NAMESPACE_BATCH_STATUS_PREFIX + "_" + id;
	}

}