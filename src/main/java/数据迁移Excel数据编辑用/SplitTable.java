package 数据迁移Excel数据编辑用;

/**
 * @description:
 * @author: zhoulei
 * @date: 2022/3/4
 */
public class SplitTable {
    public static void main(String[] args) {
        String table = "balance_transaction_record\n" +
                "bpp_visa_merchant_campaign\n" +
                "bundle\n" +
                "card_reminder\n" +
                "case_application\n" +
                "channel_account\n" +
                "channel_account_image\n" +
                "channel_account_verification\n" +
                "data_source\n" +
                "ezlink_file_operate_trance\n" +
                "gl_message_param\n" +
                "holder_temp\n" +
                "issuance_blacklist\n" +
                "merchant\n" +
                "offer\n" +
                "opt_goods\n" +
                "opt_goods_investment_assessment\n" +
                "opt_goods_uw\n" +
                "opt_goods_uw_operate_trace\n" +
                "opt_in\n" +
                "opt_in_uw\n" +
                "opt_trigger\n" +
                "opt_trigger_trace\n" +
                "order_reminder\n" +
                "outbound_request_record\n" +
                "partner\n" +
                "partner_tribe_relation\n" +
                "passage_upload_log\n" +
                "passage_upload_log_backup\n" +
                "pay_out_record\n" +
                "policy_approval_log\n" +
                "pre_auth_cap_trace\n" +
                "sequence\n" +
                "stripe_fee_record\n" +
                "tribe\n" +
                "tribe_bundle_relation\n" +
                "trigger_category\n" +
                "trigger_relation_datasource\n" +
                "trigger_relation_merchant\n" +
                "user_brand_premium_record\n" +
                "user_card\n" +
                "user_data_source\n" +
                "user_extra_policy_config\n" +
                "user_fit_activity_record\n" +
                "user_offer\n" +
                "user_opt_in_plan\n" +
                "user_visa_card_transaction\n" +
                "visa_enrollment_epm_record\n" +
                "wait_for_trigger_issuance\n" +
                "webhook_record\n";
        System.out.println(table.replaceAll("\n","\t"));
    }
}
