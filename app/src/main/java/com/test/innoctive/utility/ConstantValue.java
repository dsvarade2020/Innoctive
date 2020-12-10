package com.test.innoctive.utility;

public class ConstantValue {

    // DEV AND UAT, MERCHANT AND TERMINAL ID DEV AND UAT
    public static final String KEY = "0CA78BC6BE000BD1F54814D51CAC6508";
    public static final String IV = "24C1536E90633363";

    public static String MERCHANT_ID = "PMCREDMAA001";
    public static String TERMINAL_ID = "PMCREDTAA001";

    // LIVE DATA KEY
  /* public static final String KEY = "699CE270B9454CB6E65921EDCEB6BF9D";
    public static final String IV = "3DDC079C3BE8B30E";

    public static String MERCHANT_ID = "DAF45918-91AF-49D4-95A4-137E4FF972BB";
    public static String TERMINAL_ID = "B7FD4C07-F9EF-4E87-B2B0-24D6AEB7C725";*/

    public static final long MINUTE = 1;
    public static final int CAMERA_REQUEST = 101;
    public static final int MEDIA_TYPE_IMAGE = 102;
    public static final int PDF_REQUEST = 103;
    public static final int IMAGE_REQUEST = 104;
    public static final int PNG_REQUEST = 105;
    public static final int ATTACHMENT_REQUEST = 112;
    public static final int DIALOG_REQUEST = 113;

    public static final String SOURCE_HOST = "192.168.3.216";
    public static final String IMAGE_DIRECTORY_NAME = "PaymateInvoice";

    //-- START SAVE USER INFO
    public static String U_ADHOC = "ADHOC";
    public static String U_BUSINESS_NAME = "BusinessName";
    public static String U_CLIENT_COMPANY = "ClientCompany";
    public static String U_COMPANY_CRID = "CompanyCRID";
    public static String U_COMPANY_ID = "CompanyId";
    public static String U_COMPANY_PARENT_ID = "CompanyParentId";
    public static String U_EMAIL = "Email";
    public static String U_FIRST_NAME = "FirstName";
    public static String U_HAS_CHILD = "HasChild";
    public static String U_IS_BUSINESS_ACTIVE = "IsBusinessActive";
    public static String U_IS_EXPIRED = "IsExpired";
    public static String U_IS_INCLUSIVE = "IsInclusive";
    public static String U_IS_LOGIN = "IsLogin";
    public static String U_IS_PARENT_COMPANY = "IsParentCompany";
    public static String U_IS_PAYER = "IsPayer";
    public static String U_LAST_LOGIN = "LastLogin";
    public static String U_LAST_NAME = "LastName";
    public static String U_MESSAGE = "Message";
    public static String U_OLD_PWD = "OldPWD";
    public static String U_PASSWORD = "Password";
    public static String U_REDIRECT_URL = "RedirectUrl";
    public static String U_ROLE_ID = "RoleId";
    public static String U_SENDER_ID = "SenderId";
    public static String U_SIGNUP_MOBILE = "SignupMobile";
    public static String U_SIGNUP_STAGE = "SignupStage";
    public static String U_STATUS = "Status";
    public static String U_USER_ID = "UserId";
    public static String U_XPRESS_ID = "XpressID";

    public static String U_TERMS_ACCEPTED = "TermsAccepted";
    public static String U_IS_SUBSCRIPTION_ACTIVE = "IsSubscriptionActive";
    public static String U_PAYER_EXISTS = "PayerExists";
    public static String U_SUBSCRIPTION_NAME = "SubscriptionName";
    public static String U_COMPANY_NATURE_ID = "CompanyNatureId";
    public static String U_CLIENT_ID = "ClientId";
    public static String U_COMPANY_NATURE_NAME = "CompanyNatureName";
    public static String U_CATEGORY_ID = "CategoryId";
    public static String U_SUBCATEGORY_ID = "SubCategoryId";
    public static String U_SUBSCRIPTION_INACTIVE_REASON = "SubscriptionInactiveReason";

    public static String ERROR_CODE = "ErrorCode";
    public static String ERROR_DESCRIPTION = "ErrorDescription";
    public static String RESPONSE_TEXT = "ResponseText";
    public static String STATUS = "Status";
    public static String TOTAL_RECORDS = "TotalRecords";
//-- END SAVE USER INFO

    public static String FROM_CLASS = "FROM_CLASS";



    // for key value pair
    public static String KEY_ACTION = "Action";
    public static String REQUEST_REF_NO = "RequestRefNo";
    public static String APPROVE_REJECT = "ApproveOrReject";
    public static String TERMS_CONDITION = "TermsCondition";
    public static String TERMS_CONDITION_VALUE = "TermsConditionValue";
    public static String PAYABLE_AMOUNT = "PayableAmount";
    public static String PAYABLE_MODE = "PayableMode";
    public static String COMING_FROM = "ComingFrom";
    public static String ADD_CARD = "AddCardDetail";
    public static String ADD_BANK = "AddBank";
    public static String ADD_CARD_RESPONSE = "AddCardResponse";
    public static String BANK_LIST = "BankList";
    public static String BANK_DETAIL = "BankDetail";
    public static String PAYMENT_PROCESS = "PAYMENT_PROCESS";
    public static String DASHBOARD_TAB_INDEX = "DASHBOARD_TAB_INDEX";

    // on transaction success or fail
    public static String TRANSACTION_STATUS = "transaction_status";
    public static String TRANSACTION_TITLE = "transaction_title";
    public static String TRANSACTION_MESSAGE = "transaction_message";

    // for auto logout
    public static String IS_APP_MINIMIZED = "isAppMinimized";

    // payment request
    public static String PAYMENT_REQ_TITLE = "Payment_Req_Title";
    public static String RECEIVE_TAB_BROADCAST = "ReceiveTabBroadCast";
    public static String RECEIVE_TAB_OBJECT = "ReceiveTabObject";
    public static String DASHBOARD_CLICK_INDEX = "DashboardClickIndex";
    public static String RECEIVE_DETAIL = "ReceiveDetail";
    public static String IMAGE_ATTACHMENT = "ImageAttachment";
    public static String NEW_IMAGE_PATH = "NewImagePath";
    public static String CUSTOMER_EMAIL = "CustomerEmail";
    public static String IS_ACTIVITY_CALLED = "IsActivityCalled";
    public static String MAKE_PAYMENT_PARCELABLE = "MakePaymentParceable";

    public static String SUBSCRIPTION_RESPONSE = "SubscriptionResponse";
    public static String PAY_NOW_PAYMENT_RESPONSE = "checkDetailFragmentNew";
    public static String PAY_CHECK_PAYMENT_RESPONSE = "checkDetailFragmentNew1";
    public static String GATEWAY_RESPONSE = "GateWayResponse";
    public static String GATEWAY_TOP_UP_RESPONSE = "GateWayTopUpResponse";
    public static String GATEWAY_URL = "GateWayUrl";
    public static String MAKE_PAYMENT_CLIENT_ID = "ContactMakePayment";
    public static String REQUEST_PAYMENT_CLIENT_ID = "ContactRequestPayment";
    public static String PAYMENT_TYPE = "PaymentType";
    public static String PAYMENT_STATUS = "PaymentStatus";
    public static String FULLSCREEN_RECEIVE_REQUEST = "FullScreenReceiveRequest";

    public static String SIGN_UP = "SignUp";
    public static String USER_ID = "UserId";

    public static String SIGN_UP_TAB_INDEX = "Sign_Up_Tab_Index";
    public static String SUBSCRIBE_PLAN = "SubscribePlan";

    public static String IP_ADDRESS = "IpAddress";
    public static String IMEI_NUMBER = "ImeiNumber";
    public static String IS_ITEM_SELECTED = "IsItemSelected";
    public static String IS_ITEM_SELECTED_BROADCAST = "IsItemSelectedBroadcast";
    public static String IS_MENU_ITEM_SHOW_HIDE = "IsMenuItemShowHide";
    public static String SHOW_HIDE_MULTI_SELECTION = "ShowHideMultiSelection";
    public static String IS_SPLASH = "IsSplash";
    public static String IS_SPLASH_LOGIN = "IsSplashLogin";
    public static String IS_APP_IN_BACKGROUND = "IS_APP_IN_BACKGROUND";
    public static String PAYMENT_ORDER_ID = "PaymentOrderId";
    public static String IS_PAYMENT_OPTION_FRAME_LAYOUT_ID = "IsPaymentOptionFrameLayoutId";
    public static String IS_MULTI_PAYMENT = "IsMultiPayment";
    public static String IS_CHECKED_MULTI_CHECK_BOX = "IS_CHECKED_MULTI_CHECK_BOX";
    public static String IS_CHECKED_MULTI_CHECK_BOX_STATUS = "ISCHECKEDMULTICHECKBOX";

    public static String DIALOG_VALUE = "DialogValue";

    public static String BUSINESS_DOCUMENT = "BusinessDocument";
    public static String BUSINESS_DOCUMENT_NAME = "BusinessDocumentName";
    public static String OLD_USER_EXIST = "OldUserExist";


    //START GLOBAL TOPIC TO RECEIVE APP WIDE PUSH NOTIFICATIONS
    public static final String TOPIC_GLOBAL = "global";

    // broadcast receiver intent filters
    public static final String REGISTRATION_COMPLETE = "registrationComplete";
    public static final String PUSH_NOTIFICATION = "pushNotification";
    public static final String PUSH_NOTIFICATION_MESSAGE = "pushNotificationMessage";
    public static final String PUSH_NOTIFICATION_TITLE = "pushNotificationTitle";
    public static final String PUSH_NOTIFICATION_DATA = "pushNotificationData";
    public static final String INTENT_READ_BUNDLE = "IntentReadBundle";

    // id to handle the notification in the notification tray
    public static final int NOTIFICATION_ID = 100;
    public static final int NOTIFICATION_ID_BIG_IMAGE = 101;

    public static final String SHARED_PREF = "paymate_firebase";
    //END GLOBAL TOPIC TO RECEIVE APP WIDE PUSH NOTIFICATIONS


    public static String DUE_DATE = "DueDate";
    public static String INVOICE_NUMBER = "InvoiceNumber";
    public static String TRANSACTION_PAYMENT_STATUS = "TransactionPaymentStatus";

    public static String SERVICE_TYPE = "Android";

    public static String PAN_UPLOADED = "PAN_UPLOADED";
    public static String BUSINESS_UPLOADED = "BUSINESS_UPLOADED";
    public static String ADDRESS_UPLOADED = "ADDRESS_UPLOADED";
    public static String BANK_DERAILS = "BANK_DERAILS";
    public static String CONTACT_DETAILS = "contactDetails";
    public static String REMEMBER_ME = "Remember_Me";
    public static String REMEMBER_ME_VALUE = "Remember_Me_Value";
    public static String REGISTRATION_MESSAGE = "RegistrationMessage";

    // INVOICE
    public static String LOGIN_USER_GSTN = "LOGIN_USER_GSTN";
    public static String LOGIN_USER_STATE_ID = "LOGIN_USER_STATE_ID";
    public static String PURCHASE_ORDER_NUMBER = "PurchaseOrderNumber";
    public static String STATE_ID = "STATE_ID";
    public static String DISCOUNT_TYPE = "DISCOUNT_TYPE";
    public static String TOTAL_AMOUNT = "TOTAL_AMOUNT";
    public static String OBJECTINVOICEBO = "ObjInvoiceMobileBO";
    public static String LSTINVOICEPRODUCTBO = "lstInvoiceProductBO";
    public static String EDIT_INVOICE = "EDIT_INVOICE";
    public static String INVOICE_ITEM_POS = "INVOICE_ITEM_POS";
    public static String GST = "CGST/SGST";
    public static String GST_ONLY = "GST";
    public static String IGST = "IGST";

    public static String KYC_STATUS = "KycStatus";
    public static String ANONYMOUS_KEY = "AnonymousKey";
    public static String IS_MAPPED_OTHER_DEVICE = "IsMappedOtherDevice";

    //QUICK PIN
    public static String LOGIN_WITH_EMAIL = "LoginWithEmail";
    public static String PASS_CODE = "Passcode";
    public static String QUICK_PIN_LATER = "QuickPinLater";
    public static String OLD_PASS_CODE = "OldPassCode";
    public static String QUICK_PIN_SET = "QuickPinSet";
    public static String QUICK_PIN_BLOCKED = "QuickPinBlocked";
    public static String QUICK_PIN_COMING_THROUGH = "QuickPinComingThrough";
    public static String DASHBOARD_MESSAGE = "QuickPinMessage";
    public static String QUICK_PIN_ACTIVE = "QuickPinActive";
    public static String CURRENT_ACTIVE_PIN = "CurrentActivePin";
    public static String MPIN_TITLE = "MpinTitle";
    public static String EMPTY_QUICK_MPIN = "EmptyQuickPin";

    public static String DEEP_LINKING = "DeepLinking";
    public static String DEEP_LINKING_SESSION = "DeepLinkingSession";
    public static String DEEP_LINKING_REF_NO = "DeepLinkingRefNo";
    public static String URL_LINKING_SESSION = "UrlLinkingSession";
    public static String COMING_THROUGH_NOTIFICATION = "ComingThroughNotification";
    public static String REFERENCE_NUMBER = "ReferenceNumber";
    public static String SIGNUP_INDEX = "SignupIndex";
    public static String LOGIN_THROUGH_EMAIL = "LoginThroughEmail";
    public static String IS_ADDRESS_REJECTED = "IS_ADDRESS_REJECTED";
    public static String ADDRESS_DOCUMENT_NAME = "addressDocumentName";
    public static String NOTIFICATION_ACTION = "notification_action";
    public static String COMING_THROUGH_CLASS = "ComingThroughClass";


    public static String ACCORDION_OBJECT = "AccordionData";
    public static String ACCORDION_ACTION = "AccordionAction";
    public static String FULL_SCREEN_DIALOG_TITLE = "FullScreenDialogTitle";
    public static String GET_PENDING_PAYMENT = "GetPendingPayments";
    public static String RECEIVED_REQUEST_VIEW_MORE = "ReceivedRequestViewMore";
    public static String TRANSACTION_SUMMARY = "TransactionSummary";
    public static String RECEIVED_REQUEST_DATA = "ReceiveRequestData";

    //added by dhananjay for pending collection
    public static String GET_PENDING_COLLECTIONS = "GetPendingCollections";
    public static String PENDING_COLLECTIONS_VIEW_MORE = "PendingCollectionsViewMore";

    //-------------PREDEFINED USER ROLE ID------------------------//

    public final static String PAYER = "81";
    public final static String ADMIN = "2";
    public final static String MAKER = "6";
    public final static String MIS_USER = "5";
    public final static String CHECKER = "7";
    public final static String APPROVER_PAYER = "56";

    //-------------END---------------------------------//

    public final static String CURRENCY_SYMBOL = "currencySymbol";
    public final static String CURRENCY_INR_CODE = "INR";
    public final static String APPROVAL = "Approval";

    public final static String MESSAGE = "Message";
    public final static String PAYMENT_MODE_FOR_CARD = "paymentModeForCard";

    public final static String C_TYPE = "cType";

    public static String PERMISSION_DENY = "PermissionDeny";
    public static String U_IS_LOGGED_IN = "IsLoggedIn";
    public static String SHOULD_REFRESH_PAYMENT_TAB = "shouldRefreshPaymentTab";
    public static String SHOULD_REFRESH_COLLECTION_TAB = "shouldRefreshCollectionTab";
    public static String SHOULD_REFRESH_AWAITING_TO_APPROVE = "shouldRefreshAwaitingToApprove";
    public static String TOTAL_CONTACT = "TotalContact";
    public static String IS_SELECT_CONTACT = "IsSelect";
    public static String IS_BACK_EMAIL_CLICKED = "IsEmailBackClicked";
    public static String EMAIL_BACK_TAB_INDEX = "EmailBackTabIndex";

    public static String IS_KYC_SKIP = "IsKycSkip";
    public static String IS_ADD_CARD_SKIP = "IsAddCardSkip";

    public static String MAKE_PAYMENT_REQUEST = "MakePaymentRequest";
    public static String IS_PAYEE_ADD_CONTACT = "IsPayeeAddContact";
    public static String IS_ADD_ADDITIONAL_DETAIL = "IsAddAdditionalDetails";

    public static String U_LOGIN_ID = "LoginId";
    public static String IS_UNMAPPED = "IsUnMapped";
    public static String KYC_STATUS_MESSAGE = "KycStatusMessage";
    public static String KYC_PARTIALLY_UPLOADED = "KycPartiallyUploaded";

}
