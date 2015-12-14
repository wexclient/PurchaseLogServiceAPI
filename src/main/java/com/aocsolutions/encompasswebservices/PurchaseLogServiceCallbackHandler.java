/**
 * PurchaseLogServiceCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.3  Built on : Jun 27, 2015 (11:17:49 BST)
 */
package com.aocsolutions.encompasswebservices;


/**
 *  PurchaseLogServiceCallbackHandler Callback class, Users can extend this class and implement
 *  their own receiveResult and receiveError methods.
 */
public abstract class PurchaseLogServiceCallbackHandler {
    protected Object clientData;

    /**
     * User can pass in any object that needs to be accessed once the NonBlocking
     * Web service call is finished and appropriate method of this CallBack is called.
     * @param clientData Object mechanism by which the user can pass in user data
     * that will be avilable at the time this callback is called.
     */
    public PurchaseLogServiceCallbackHandler(Object clientData) {
        this.clientData = clientData;
    }

    /**
     * Please use this constructor if you don't want to set any clientData
     */
    public PurchaseLogServiceCallbackHandler() {
        this.clientData = null;
    }

    /**
     * Get the client data
     */
    public Object getClientData() {
        return clientData;
    }

    /**
     * auto generated Axis2 call back method for getRecentAccountActivityInternational method
     * override this method for handling normal response from getRecentAccountActivityInternational operation
     */
    public void receiveResultgetRecentAccountActivityInternational(
        com.aocsolutions.encompasswebservices.PurchaseLogServiceStub.GetRecentAccountActivityInternationalResponseE result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getRecentAccountActivityInternational operation
     */
    public void receiveErrorgetRecentAccountActivityInternational(
        java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for queryPurchaseLogs method
     * override this method for handling normal response from queryPurchaseLogs operation
     */
    public void receiveResultqueryPurchaseLogs(
        com.aocsolutions.encompasswebservices.PurchaseLogServiceStub.QueryPurchaseLogsResponseE result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from queryPurchaseLogs operation
     */
    public void receiveErrorqueryPurchaseLogs(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for deleteAuthorization method
     * override this method for handling normal response from deleteAuthorization operation
     */
    public void receiveResultdeleteAuthorization(
        com.aocsolutions.encompasswebservices.PurchaseLogServiceStub.DeleteAuthorizationResponseE result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from deleteAuthorization operation
     */
    public void receiveErrordeleteAuthorization(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for instantApproval method
     * override this method for handling normal response from instantApproval operation
     */
    public void receiveResultinstantApproval(
        com.aocsolutions.encompasswebservices.PurchaseLogServiceStub.InstantApprovalResponseE result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from instantApproval operation
     */
    public void receiveErrorinstantApproval(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getTransactions method
     * override this method for handling normal response from getTransactions operation
     */
    public void receiveResultgetTransactions(
        com.aocsolutions.encompasswebservices.PurchaseLogServiceStub.GetTransactionsResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getTransactions operation
     */
    public void receiveErrorgetTransactions(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for disputeTransaction method
     * override this method for handling normal response from disputeTransaction operation
     */
    public void receiveResultdisputeTransaction(
        com.aocsolutions.encompasswebservices.PurchaseLogServiceStub.DisputeTransactionResponseE result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from disputeTransaction operation
     */
    public void receiveErrordisputeTransaction(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for deleteInstantApproval method
     * override this method for handling normal response from deleteInstantApproval operation
     */
    public void receiveResultdeleteInstantApproval(
        com.aocsolutions.encompasswebservices.PurchaseLogServiceStub.DeleteInstantApprovalResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from deleteInstantApproval operation
     */
    public void receiveErrordeleteInstantApproval(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for submitPurchaseLogAndGetImagePdf method
     * override this method for handling normal response from submitPurchaseLogAndGetImagePdf operation
     */
    public void receiveResultsubmitPurchaseLogAndGetImagePdf(
        com.aocsolutions.encompasswebservices.PurchaseLogServiceStub.SubmitPurchaseLogAndGetImagePdfResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from submitPurchaseLogAndGetImagePdf operation
     */
    public void receiveErrorsubmitPurchaseLogAndGetImagePdf(
        java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for cancelPurchaseLog method
     * override this method for handling normal response from cancelPurchaseLog operation
     */
    public void receiveResultcancelPurchaseLog(
        com.aocsolutions.encompasswebservices.PurchaseLogServiceStub.CancelPurchaseLogResponseE result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from cancelPurchaseLog operation
     */
    public void receiveErrorcancelPurchaseLog(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for submitPurchaseLogWithFaxInfo method
     * override this method for handling normal response from submitPurchaseLogWithFaxInfo operation
     */
    public void receiveResultsubmitPurchaseLogWithFaxInfo(
        com.aocsolutions.encompasswebservices.PurchaseLogServiceStub.SubmitPurchaseLogWithFaxInfoResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from submitPurchaseLogWithFaxInfo operation
     */
    public void receiveErrorsubmitPurchaseLogWithFaxInfo(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getBackupCardsInternational method
     * override this method for handling normal response from getBackupCardsInternational operation
     */
    public void receiveResultgetBackupCardsInternational(
        com.aocsolutions.encompasswebservices.PurchaseLogServiceStub.GetBackupCardsInternationalResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getBackupCardsInternational operation
     */
    public void receiveErrorgetBackupCardsInternational(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getBackupCardsWithoutWaitingInternational method
     * override this method for handling normal response from getBackupCardsWithoutWaitingInternational operation
     */
    public void receiveResultgetBackupCardsWithoutWaitingInternational(
        com.aocsolutions.encompasswebservices.PurchaseLogServiceStub.GetBackupCardsWithoutWaitingInternationalResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getBackupCardsWithoutWaitingInternational operation
     */
    public void receiveErrorgetBackupCardsWithoutWaitingInternational(
        java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getPaymentInformationUrl method
     * override this method for handling normal response from getPaymentInformationUrl operation
     */
    public void receiveResultgetPaymentInformationUrl(
        com.aocsolutions.encompasswebservices.PurchaseLogServiceStub.GetPaymentInformationUrlResponseE result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getPaymentInformationUrl operation
     */
    public void receiveErrorgetPaymentInformationUrl(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getRecentAccountActivity method
     * override this method for handling normal response from getRecentAccountActivity operation
     */
    public void receiveResultgetRecentAccountActivity(
        com.aocsolutions.encompasswebservices.PurchaseLogServiceStub.GetRecentAccountActivityResponseE result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getRecentAccountActivity operation
     */
    public void receiveErrorgetRecentAccountActivity(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getPresetBackupCardsWithImagePdf method
     * override this method for handling normal response from getPresetBackupCardsWithImagePdf operation
     */
    public void receiveResultgetPresetBackupCardsWithImagePdf(
        com.aocsolutions.encompasswebservices.PurchaseLogServiceStub.GetPresetBackupCardsWithImagePdfResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getPresetBackupCardsWithImagePdf operation
     */
    public void receiveErrorgetPresetBackupCardsWithImagePdf(
        java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for submitBackupPurchaseLog method
     * override this method for handling normal response from submitBackupPurchaseLog operation
     */
    public void receiveResultsubmitBackupPurchaseLog(
        com.aocsolutions.encompasswebservices.PurchaseLogServiceStub.SubmitBackupPurchaseLogResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from submitBackupPurchaseLog operation
     */
    public void receiveErrorsubmitBackupPurchaseLog(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getBackupCardsWithoutWaiting method
     * override this method for handling normal response from getBackupCardsWithoutWaiting operation
     */
    public void receiveResultgetBackupCardsWithoutWaiting(
        com.aocsolutions.encompasswebservices.PurchaseLogServiceStub.GetBackupCardsWithoutWaitingResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getBackupCardsWithoutWaiting operation
     */
    public void receiveErrorgetBackupCardsWithoutWaiting(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for orderBackupCards method
     * override this method for handling normal response from orderBackupCards operation
     */
    public void receiveResultorderBackupCards(
        com.aocsolutions.encompasswebservices.PurchaseLogServiceStub.OrderBackupCardsResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from orderBackupCards operation
     */
    public void receiveErrororderBackupCards(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for updatePurchaseLog method
     * override this method for handling normal response from updatePurchaseLog operation
     */
    public void receiveResultupdatePurchaseLog(
        com.aocsolutions.encompasswebservices.PurchaseLogServiceStub.UpdatePurchaseLogResponseE result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from updatePurchaseLog operation
     */
    public void receiveErrorupdatePurchaseLog(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for resendNotification method
     * override this method for handling normal response from resendNotification operation
     */
    public void receiveResultresendNotification(
        com.aocsolutions.encompasswebservices.PurchaseLogServiceStub.ResendNotificationResponseE result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from resendNotification operation
     */
    public void receiveErrorresendNotification(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for submitBackupPurchaseLogWithFaxInfo method
     * override this method for handling normal response from submitBackupPurchaseLogWithFaxInfo operation
     */
    public void receiveResultsubmitBackupPurchaseLogWithFaxInfo(
        com.aocsolutions.encompasswebservices.PurchaseLogServiceStub.SubmitBackupPurchaseLogWithFaxInfoResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from submitBackupPurchaseLogWithFaxInfo operation
     */
    public void receiveErrorsubmitBackupPurchaseLogWithFaxInfo(
        java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getPurchaseLogHistory method
     * override this method for handling normal response from getPurchaseLogHistory operation
     */
    public void receiveResultgetPurchaseLogHistory(
        com.aocsolutions.encompasswebservices.PurchaseLogServiceStub.GetPurchaseLogHistoryResponseE result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getPurchaseLogHistory operation
     */
    public void receiveErrorgetPurchaseLogHistory(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getInternalBackupInventoryInfo method
     * override this method for handling normal response from getInternalBackupInventoryInfo operation
     */
    public void receiveResultgetInternalBackupInventoryInfo(
        com.aocsolutions.encompasswebservices.PurchaseLogServiceStub.GetInternalBackupInventoryInfoResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getInternalBackupInventoryInfo operation
     */
    public void receiveErrorgetInternalBackupInventoryInfo(
        java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for submitCheckLog method
     * override this method for handling normal response from submitCheckLog operation
     */
    public void receiveResultsubmitCheckLog(
        com.aocsolutions.encompasswebservices.PurchaseLogServiceStub.SubmitCheckLogResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from submitCheckLog operation
     */
    public void receiveErrorsubmitCheckLog(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for retrievePurchaseLog method
     * override this method for handling normal response from retrievePurchaseLog operation
     */
    public void receiveResultretrievePurchaseLog(
        com.aocsolutions.encompasswebservices.PurchaseLogServiceStub.RetrievePurchaseLogResponseE result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from retrievePurchaseLog operation
     */
    public void receiveErrorretrievePurchaseLog(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getPresetBackupCards method
     * override this method for handling normal response from getPresetBackupCards operation
     */
    public void receiveResultgetPresetBackupCards(
        com.aocsolutions.encompasswebservices.PurchaseLogServiceStub.GetPresetBackupCardsResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getPresetBackupCards operation
     */
    public void receiveErrorgetPresetBackupCards(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getDisputedTransactions method
     * override this method for handling normal response from getDisputedTransactions operation
     */
    public void receiveResultgetDisputedTransactions(
        com.aocsolutions.encompasswebservices.PurchaseLogServiceStub.GetDisputedTransactionsResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getDisputedTransactions operation
     */
    public void receiveErrorgetDisputedTransactions(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for submitPurchaseLog method
     * override this method for handling normal response from submitPurchaseLog operation
     */
    public void receiveResultsubmitPurchaseLog(
        com.aocsolutions.encompasswebservices.PurchaseLogServiceStub.SubmitPurchaseLogResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from submitPurchaseLog operation
     */
    public void receiveErrorsubmitPurchaseLog(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getTransactionsInternational method
     * override this method for handling normal response from getTransactionsInternational operation
     */
    public void receiveResultgetTransactionsInternational(
        com.aocsolutions.encompasswebservices.PurchaseLogServiceStub.GetTransactionsInternationalResponseE result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getTransactionsInternational operation
     */
    public void receiveErrorgetTransactionsInternational(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for createPurchaseLog method
     * override this method for handling normal response from createPurchaseLog operation
     */
    public void receiveResultcreatePurchaseLog(
        com.aocsolutions.encompasswebservices.PurchaseLogServiceStub.CreatePurchaseLogResponseE result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from createPurchaseLog operation
     */
    public void receiveErrorcreatePurchaseLog(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for retrieveSecureCodeAuthPin method
     * override this method for handling normal response from retrieveSecureCodeAuthPin operation
     */
    public void receiveResultretrieveSecureCodeAuthPin(
        com.aocsolutions.encompasswebservices.PurchaseLogServiceStub.RetrieveSecureCodeAuthPinResponseE result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from retrieveSecureCodeAuthPin operation
     */
    public void receiveErrorretrieveSecureCodeAuthPin(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getBackupCards method
     * override this method for handling normal response from getBackupCards operation
     */
    public void receiveResultgetBackupCards(
        com.aocsolutions.encompasswebservices.PurchaseLogServiceStub.GetBackupCardsResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getBackupCards operation
     */
    public void receiveErrorgetBackupCards(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getPaymentSchedule method
     * override this method for handling normal response from getPaymentSchedule operation
     */
    public void receiveResultgetPaymentSchedule(
        com.aocsolutions.encompasswebservices.PurchaseLogServiceStub.GetPaymentScheduleResponseE result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getPaymentSchedule operation
     */
    public void receiveErrorgetPaymentSchedule(java.lang.Exception e) {
    }
}
