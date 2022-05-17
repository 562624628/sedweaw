package helper;

/**
 * @description:
 * @author: zhoulei
 * @date: 2022/5/10
 */

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *select nn.template_id,
 *       nn.notification_code,
 *       ntc.subject,
 *
 *       notification_name,
 *       trigger_source_id,
 *       sender_source_id,
 *       nsd.data_code  as data_code,
 *
 *       nsd2.data_name as sender
 *from incomenew_notice_00.notify_notification_content ntc
 *         inner join incomenew_notice_00.notify_notification nn on nn.notification_code = ntc.notification_code
 *         inner join incomenew_notice_00.notify_source_data nsd on nn.trigger_source_id = nsd.id
 */
public class notice_template映射关系 {
    public static void main(String[] args) {
        String a = "PLI700001021\tWelcome to TRIBE!\n" +
                "PLI700001062\tUpdates to your plan\n" +
                "POSC64040596406280\tA Add Driver Request Has Been Submitted\n" +
                "POSC64041038905345\tNamed Driver Added To Your Personal Usage-Based Motor Insurance\n" +
                "POS64041542221827\tNamed Driver Not Added To Your Personal Usage-Based Motor Insurance\n" +
                "POSC64042097967109\tA Policy Cancellation Request Has Been Submitted\n" +
                "Payment64253646077952\tPayment Failure\n" +
                "POSC64812910379008\tAn endorsement Request Has Been Submitted\n" +
                "POS64813405306882\tYour Policy Details Has Been Updated\n" +
                "CLS66789616648194\tYour claims submissions have been reviewed (${ClaimNo})\n" +
                "CLS66806236577798\tCritical Illness (Pay Per Trip) - Settlement(${ClaimNo})\n" +
                "CLS66813075390466\tSettlement (${ClaimNo})\n" +
                "CLS66816481165316\tSettlement (${ClaimNo})\n" +
                "CLS66818339241990\tYour claims submissions have been reviewed (${ClaimNo})\n" +
                "CLS66819452829704\tEx-gratia (${ClaimNo})\n" +
                "CLS66825882697729\tEx-gratia (${ClaimNo})\n" +
                "CLR66827214389251\tYour claims submissions have been reviewed (${ClaimNo})\n" +
                "CLR66828390891525\tRejection (${ClaimNo})\n" +
                "CLR66829179420679\tRejection (${ClaimNo})\n" +
                "CLR66830204928000\tRejection (${ClaimNo})\n" +
                "CLR66831205269506\tRejection (${ClaimNo})\n" +
                "CLR66832918642692\tRejection (${ClaimNo})\n" +
                "Claim66833782669318\tYour claims submissions have been reviewed (${ClaimNo})\n" +
                "Claim66834984337416\tWithdrawn (${ClaimNo})\n" +
                "Claim66835712049153\tWithdrawn (${ClaimNo})\n" +
                "CLS67144955985920\tSettlement(${ClaimNo})\n" +
                "CLS67146598055938\tSettlement (${ClaimNo})\n" +
                "Claim67147527094276\tWithdrawn(${ClaimNo})\n" +
                "Claim67149280313350\tPending requirement(s) (${ClaimNo})\n" +
                "Claim67151354396672\tPending requirement(s) (${ClaimNo})\n" +
                "Claim67152983883778\tPending requirement(s) (${ClaimNo})\n" +
                "Claim67154120540164\tPending requirement(s) (${ClaimNo})\n" +
                "Claim67154982469638\tPending requirement(s) (${ClaimNo})\n" +
                "POS67172250419205\tBeneficiary Nomination(${CustomerServiceNo})\n" +
                "PLI67340202934272\tHooray, you're officially a Chillax Pack subscriber!\n" +
                "PLI67340513312770\tWe are happy to see you back on Chillax Pack!\n" +
                "POS67874509029378\tVoid policy\n" +
                "Payment74781074391040\tYou've successfully withdrawn your investment!\n" +
                "POSC74790339608578\tYour investment withdrawal is on the way!\n" +
                "CLA74907308261380\tAcknowledgement of claim submission (${ApplicationNo})\n" +
                "Claim75465941319686\tWithdraw (${ClaimNo})\n" +
                "CLS77323793596423\tclaim gratia\n" +
                "CLS77323923619840\taccept settlement\n" +
                "POS77475004547074\tWe are sad to see you leave Chillax Pack\n" +
                "POS77479823802372\tWe are sad to see you leave Chillax Pack\n" +
                "POS77480572485638\tWe are sad to see you leave Chillax Pack\n" +
                "Payment77487730065416\tYour payment for Chillax Pack is not successful\n" +
                "POS77505780252673\tYour Chillax Pack subscription has been terminated\n" +
                "UC77518516256771\tCorporate customer grade check ${date}\n" +
                "Payment78020790452229\tWe have made a payment to your PayNow account\n" +
                "POS78021788696583\tWe are happy to see you back on Chillax Pack!\n" +
                "POS78022405259264\tYay, you can access your Chillax Pack promo codes now!\n" +
                "Payment78035187400706\tYay, your Chillax Pack promo codes are here!\n" +
                "CLS80208319217665\tA claim (${caseNo}) is approved or exgratia on ${settledDate}\n" +
                "CLS80573326426115\ttest\n" +
                "Claim81070988984326\tPending requirement(s) (${ApplicationNo})\n" +
                "CLS81070194163716\tSettlement (${ApplicationNo})\n" +
                "CLR81073732059144\tRejection (${ApplicationNo})\n" +
                "Claim81074730303490\tWithdrawn (${ApplicationNo})\n" +
                "CLS81075437043716\tEx-gratia (${ApplicationNo})\n" +
                "CLR81986314043397\tReject CoverBase\n" +
                "Payment82562175205381\tYour payout has been processed\n" +
                "Payment85063949615105\tYour payout has been processed\n" +
                "PLI89042280513537\tCancel master policy\n" +
                "PLI89451946573824\tThank you for your application\n";

        String b = "eventCode-2019092600000000001\tYour Motor Policy\n" +
                "eventCode-2019092600000000002\tNew Vehicles Added into Your Motor Policy\n" +
                "eventCode-2019092600000000003\tVehicle Deleted from Your Motor Policy\n" +
                "eventCode-2019092600000000004\tYour Motor Policy has been cancelled\n" +
                "eventCode-2019092600000000005\tMonthly Premium for Your Motor Policy\n" +
                "eventCode-2018100800000000003\tPresenting Your Ticket Cover ${policyNo}\n" +
                "eventCode-2018100800000000010\tWeeee! Ticket Cover Claim Approved!\n" +
                "eventCode-2018100800000000011\tYour Parasol Claim ${policyNo} is Invalid\n" +
                "eventCode-2018100800000000012\tCustomer Submitted a Claim\n" +
                "eventCode-2018100800000000014\tCalculating Your Ticket Cover Claim Amount Now!\n" +
                "eventCode-2018100800000000015\tHigh Temperature Detected! \n" +
                "eventCode-2018100800000000016\tCustomer Feedback\n" +
                "eventCode-2018100800000000017\tYour registration is successful\n" +
                "eventCode-2018100800000000018\tYour password is reset\n" +
                "eventCode-2018100800000000019\tPolicy Cancelation\n" +
                "eventCode-2019052300000000001\tClaim ${reportNo} is ${decide} by ${operatorName}\n" +
                "eventCode-2019061300000000001\t${subject}\n" +
                "eventCode-2019061400000000001\tCritical Illness (Pay Per Trip) - Claim Submission (${reportNo})\n" +
                "eventCode-2019061400000000002\tCritical Illness (Pay Per Trip) - Settlement(<${reportNo}>)\n" +
                "eventCode-2019061400000000003\tCritical Illness (Pay Per Trip) – Withdrawn Claims(<${reportNo}>) \n" +
                "eventCode-2019061400000000004\t${productName} – Debit Note\n" +
                "eventCode-2019062000000000001\tCritical Illness (Pay Per Trip) - Credit Note\n" +
                "eventCode-2019071600000000001\tA claim is approved\n" +
                "eventCode-2019071600000000002\tA refund is completed\n" +
                "eventCode-2019061400000000000\t${subject}\n" +
                "eventCode-00000000202002270101\tYour Motor Policy\n" +
                "eventCode-00000000202002270201\tYour Motor Policy has been updated\n" +
                "eventCode-000000002020022701\tEx-gratia (${reportNo})\n" +
                "eventCode-000000002020022702\tSettlement (${reportNo})\n" +
                "eventCode-2019083000000000001\tDaily Graphene Report for customer grade ${reportDate}\n" +
                "eventCode-2019112600000000001\tYou asked for it, so here it is!\n" +
                "eventCode-2019112600000000002\tEx-gratia (${reportNo})\n" +
                "eventCode-2019112600000000003\tPending requirement(s) (${reportNo})\n" +
                "eventCode-2019112600000000004\tRejection (${reportNo})\n" +
                "eventCode-2019112600000000005\tSettlement (${reportNo})\n" +
                "eventCode-2019112600000000006\tWithdrawn (${reportNo})\n" +
                "eventCode-2019112600000000007\tSettlement (${reportNo})\n" +
                "eventCode-2019120900000000001\tWe're sorry it didn't work out\n" +
                "eventCode-2019120900000000002\tYour very first protection!\n" +
                "eventCode-2019120900000000003\tWe're processing your refund\n" +
                "eventCode-2019120900000000004\tYou are about to age out of your plan\n" +
                "eventCode-2019120900000000005\tYour updated profile and revised rates\n" +
                "eventCode-2019120900000000006\tYou're still on SNACK!\n" +
                "eventCode-2019120900000000007\tBigger and better with SNACK+!\n" +
                "eventCode-2019120900000000008\tAcknowledgement of claim submission (${reportNo})\n" +
                "eventCode-2019120900000000009\tEmail Verification\n" +
                "eventCode-2019120900000000010\tA claim (${reportNo}) is approved or exgratia on ${settledDate}\n" +
                "eventCode-2019120900000000011\tDaily Graphene Report for customer grade ${date}\n" +
                "eventCode-2019121100000121101\tPending requirement(s) (${reportNo})\n" +
                "eventCode-2019121100000121102\tRejection (${reportNo})\n" +
                "eventCode-2019121100000121103\tWithdrawn (${reportNo})\n" +
                "eventCode-2019121100000121104\tEx-gratia (${reportNo})\n" +
                "eventCode-2019121100000121105\tSettlement (${reportNo})\n" +
                "eventCode-2019121100000121106\tAcknowledgement of claim submission (${reportNo})\n" +
                "eventCode-2020091400000000005\t${subject}\n" +
                "eventCode-2019121600000000001\tCancel master policy\n" +
                "eventCode-2019121600000000002\tVoid policy\n" +
                "eventCode-2019122500000000001\tacknowledgement_of_claim_submission_ci\n" +
                "eventCode-2020032600000000001\tYou're still on SNACK!\n" +
                "eventCode-2020032600000000002\tBigger and better with SNACK+!\n" +
                "eventCode-2020051300000000001\tA Policy Cancellation Request Has Been Submitted\n" +
                "eventCode-2020051300000000002\tSuccessful Cancellation of Your Personal Usage-Based Motor Insurance\n" +
                "eventCode-2020051300000000003\tSuccessful Cancellation of Your Personal Usage-Based Motor Insurance\n" +
                "eventCode-2020051400000000001\tYour Personal Usage-Based Motor Insurance\n" +
                "eventCode-2020063000000000001\tVerify your TRIBE account!\n" +
                "eventCode-2020070200000000003\tYour payment has been received.\n" +
                "eventCode-2020070800000000001\tPremium payment failure\n" +
                "eventCode-2020071600000000001\tA Policy Cancellation Request Has Been Submitted\n" +
                "eventCode-2020071600000000002\tSuccessful Cancellation of Your Personal Usage-Based Motor Insurance\n" +
                "eventCode-2020071600000000003\tSuccessful Cancellation of Your Personal Usage-Based Motor Insurance\n" +
                "eventCode-2020071600000000004\tYour Policy Details Has Been Updated\n" +
                "eventCode-2020071600000000005\tNamed Driver Added To Your Personal Usage-Based Motor Insurance\n" +
                "eventCode-2020071600000000006\tNamed Driver Removed From Your Personal Usage-Based Motor Insurance\n" +
                "eventCode-2020072400000000001\tThank you for your application\n" +
                "eventCode-2020072400000000002\tWelcome to TRIBE!\n" +
                "eventCode-2020072700000000001\tUpdates to your plan\n" +
                "eventCode-2020072700000000002\tUpdates to your plan\n" +
                "eventCode-2020072700000000003\tUpdates to your plan\n" +
                "eventCode-2020072700000000004\tCongratulations, your application is successful!\n" +
                "eventCode-2020072700000000005\tThank you for your application\n" +
                "eventCode-2020072700000000006\tYour policy has been cancelled\n" +
                "eventCode-2020072700000000007\tYour payout has been processed\n" +
                "eventCode-2020072900000000001\tLTA Error Feedback\n" +
                "eventCode-2020073100000000001\t Monthly Debit Note for Personal Usage-Based Motor Insurance\n" +
                "eventCode-2020080300000000003\tYour policy has been terminated\n" +
                "eventCode-2020080300000000004\tYour policy is renewed!\n" +
                "eventCode-2020080300000000005\tYour policy cannot be renewed\n" +
                "eventCode-2020080300000000006\tYour plan has been terminated\n" +
                "eventCode-2020080600000000001\tYou're almost there!\n" +
                "eventCode-2020080600000000002\tYou're almost there!\n" +
                "eventCode-2020080600000000003\tConfirmation for claims submission\n" +
                "eventCode-2020080600000000004\tYour claims submissions has been reviewed\n" +
                "eventCode-2020080600000000005\tIssue with your policy\n" +
                "eventCode-2020080600000000006\tYour payout has failed\n" +
                "eventCode-2020080600000000007\tExpiring credit card\n" +
                "eventCode-2020082700000000001\t${env}LTA Transmission ${date}\n" +
                "eventCode-2020090700000000001\tTRIBE Contact Us Query\n" +
                "eventCode-2020091700000000001\tPayNow account needed\n" +
                "eventCode-2020092200000000001\tA Add Driver Request Has Been Submitted\n" +
                "eventCode-2020092200000000002\tA Remove Driver Request Has Been Submitted\n" +
                "eventCode-2020092300000000001\tAn endorsement Request Has Been Submitted\n" +
                "eventCode-2020092400000000001\tNamed Driver Not Added To Your Personal Usage-Based Motor Insurance\n" +
                "eventCode-2020092400000000002\tNamed Driver Not Removed From Your Personal Usage-Based Motor Insurance\n" +
                "eventCode-2020110600000000001\tUpdates to your plan\n" +
                "eventCode-2020111100000000001\tYour policy has been cancelled\n" +
                "eventCode-2020112600000000001\tUpdates to your plan\n" +
                "eventCode-2020112800000000001\tYour policy has been cancelled\n" +
                "eventCode-2020113000000000001\tPending requirement(s) (${reportNo})\n" +
                "eventCode-2020120200000000001\tYour claims submissions have been reviewed (${reportNo})\n" +
                "eventCode-2020120200000000002\tYour claims submissions have been reviewed (${reportNo})\n" +
                "eventCode-2020120400000000001\tYour claims submissions have been reviewed (${reportNo})\n" +
                "eventCode-2020120500000000001\tConfirmation for claim submission (${reportNo})\n" +
                "eventCode-2020121000000000001\tPending requirement(s) (${reportNo})\n" +
                "eventCode-2020121100000000001\tAcknowledgement of claim submission (${reportNo})\n" +
                "eventCode-2020122100000000002\tVerify your email address\n" +
                "eventCode-2021010600000000001\tWithdrawn(${reportNo})\n" +
                "eventCode-2021010700000000001\tBeneficiary Nomination\n" +
                "eventCode-2021041500000000001\tCongratulations, your application is successful!\n" +
                "eventCode-20210720142000001\tYour investment journey has started on SNACK!\n" +
                "eventCode-20210720143000001\tYou've successfully withdrawn your investment!\n" +
                "eventCode-2021071317273400001\t${reportDate} Daily Transactions Report for ILP – SNACK INVESTMENT\n" +
                "eventCode-2021071317283400001\t${startTime} to ${endTime} PreTransDetailsILP for ASNINC – SNACK INVESTMENT\n" +
                "eventCode-2021071317293400001\t${reportDate}  SFTP for SNACK INVESTMENT\n" +
                "eventCode-2021071317303400001\t${reportDate} Daily Totals Report for ILP – SNACK INVESTMENT\n" +
                "eventCode-2021072012243400001\tYou've successfully withdrawn your investment!\n" +
                "eventCode-2021072610463500001\tYour investment withdrawal is on the way!\n" +
                "eventCode-2021072610463600001\tYou've successfully withdrawn your investment!\n" +
                "eventCode-2021080200000000002\tYour Personal Usage-Based Motor Insurance\n" +
                "eventCode-2021080600000000001\tYour application has been processed\n" +
                "eventCode-2021080600000000002\tWe are unable to proceed with your TRIBE policy purchase\n" +
                "eventCode-2021081011213400001\tHere are the details of your claim\n" +
                "eventCode-2021081011213400002\tHere are the details of your claim\n" +
                "eventCode-2021081900000000001\tCorporate customer grade check ${date}\n" +
                "eventCode-2021082410503400001\tExtension for Your Personal Usage-Based Motor Insurance\n" +
                "eventCode-2021090217290000001\tAcknowledgement of claim submission (${reportNo})\n" +
                "eventCode-2021090314440000001\tPending requirement(s) (${reportNo})\n" +
                "eventCode-2021090615010000001\tSettlement (${reportNo})\n" +
                "eventCode-2021090615390000001\tEx-gratia (${reportNo})\n" +
                "eventCode-2021090616260000001\tReject (${reportNo})\n" +
                "eventCode-2021090617570000001\tWithdraw (${reportNo})\n" +
                "eventCode-2021090618290000001\tA claim (${reportNo}) is approved or exgratia on ${settledDate}\n" +
                "eventCode-2021091314093400001\tYour Policy Details Has Been Updated\n" +
                "eventCode-2021091811100000001\tHooray, you're officially a Chillax Pack subscriber!\n" +
                "eventCode-2021091811170000001\tWe are happy to see you back on Chillax Pack!\n" +
                "eventCode-2021091811180000001\tYay, you can access your Chillax Pack promo codes today!\n" +
                "eventCode-2021091811190000001\tWe are sad to see you leave Chillax Pack\n" +
                "eventCode-2021100811190000001\tYour Chillax Pack – Illness & Injury claim payout is on the way!\n" +
                "eventCode-2021101111030000001\tWe are sad to see you leave Chillax Pack\n" +
                "eventCode-2021101200000000001\tWe are happy to see you back on Chillax Pack!\n" +
                "eventCode-2021101411240000001\tWe are sad to see you leave Chillax Pack\n" +
                "eventCode-2021101911190000001\tWe have made a payment to your PayNow account\n" +
                "eventCode-2021101918480000001\tYay, your Chillax Pack promo codes will be ready today!\n" +
                "eventCode-2021102011190000001\tYour payment for Chillax Pack is not successful\n" +
                "eventCode-2021102618330000001\tPayment Due for ${partnerName}\n" +
                "eventCode-2021110111180000001\tHere are the details of your claim\n" +
                "eventCode-2021110318000000001\tYour Chillax Pack subscription has been terminated\n" +
                "eventCode-2021112500000000001\tAuto-Investment Transactions-Failed Generation\n" +
                "eventCode-2022010400000000002\tYour claims submissions have been reviewed(${claimNumber})\n" +
                "eventCode-2022010400000000003\tYour claims submissions have been reviewed(${claimNumber})\n" +
                "eventCode-2022010400000000004\tYour claims submissions have been reviewed(${claimNumber})\n" +
                "eventCode-2022010400000000005\tWithdraw(${claimNumber})\n" +
                "eventCode-2022010400000000006\tVerify your email address\n" +
                "eventCode-2022011000000000001\tAcknowledgement of claim submission (${claimNumber})\n" +
                "eventCode-2022011100000000001\tPending requirement(s) (${claimNumber})\n" +
                "eventCode-2022020700000000001\tYour plan has been terminated.\n" +
                "eventCode-2022030500000000002\tYour payment has been received.\n" +
                "eventCode-2022030500000000003\tPayment not received.\n" +
                "eventCode-2022030900000000001\tCongratulations, your application is successful!\n" +
                "eventCode-2022031000000000001\tYour plan has been terminated.\n" +
                "eventCode-2022031013300000001\tYour plan has been terminated.\n" +
                "eventCode-2022031013350000001\tYour plan has been calcelled.\n" +
                "eventCode-2022031013400000001\tUpadates to your plan\n" +
                "eventCode-2022031013450000001\tYour plan has been terminated.\n" +
                "eventCode-2022031115000000001\tYour plan has been calcelled.\n" +
                "eventCode-2022031400000000004\tThank you for your application\n" +
                "eventCode-2022031623340000001\tPayment Due for ${partnerName}\n";
        String[] splita = a.split("\n");
        String[] splitb = b.split("\n");
        Arrays.asList(splita).forEach(x->{

            Stream<String> aNull = Arrays.asList(splitb).stream().map(y -> {
                String b1 = y.split("\t")[1];
                String a1 = x.split("\t")[1];
                if (a1.equals(b1)) {
                    return y.split("\t")[0];
                }
                return "null";
            }).filter(n -> !n.equals("null"));
            List<String> collect = aNull.collect(Collectors.toList());
            String s = collect.stream().findFirst().orElse(null);
            System.out.println(x.split("\t")[0]+"\t"+s+"\t"+x.split("\t")[1]+"\t"+collect.size());
        });
    }


}
