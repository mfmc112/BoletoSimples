package com.boleto.asset;

import java.util.List;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;
import org.codehaus.jackson.map.annotate.JsonSerialize;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
@JsonPropertyOrder({
	"id",
	"expire_at",
	"paid_at",
	"description",
	"status",
	"shorten_url",
	"customer_person_type",
	"customer_person_name",
	"customer_cnpj_cpf",
	"customer_address",
	"customer_state",
	"customer_neighborhood",
	"customer_zipcode",
	"customer_address_number",
	"customer_address_complement",
	"customer_phone_number",
	"customer_email",
	"created_via_api",
	"customer_city_name",
	"paid_amount",
	"amount",
	"url",
	"formats",
	"meta",
	"fine_for_delay",
	"fine_type",
	"fine_percentage",
	"fine_value",
	"late_payment_interest",
	"interest_type",
	"interest_daily_value",
	"interest_daily_percentage",
	"interest_monthly_percentage",
	"discount_type",
	"discount_limit_date",
	"discount_value",
	"discount_percentage",
	"notes",
	"bank_rate",
	"bank_billet_account_id",
	"beneficiary_name",
	"beneficiary_cnpj_cpf",
	"beneficiary_address",
	"beneficiary_assignor_code",
	"guarantor_name",
	"guarantor_cnpj_cpf",
	"payment_place",
	"instructions",
	"document_date",
	"document_type",
	"document_number",
	"acceptance",
	"processed_our_number",
	"processed_our_number_raw",
	"bank_contract_slug",
	"agency_number",
	"agency_digit",
	"account_number",
	"account_digit",
	"extra1",
	"extra1_digit",
	"extra2",
	"extra2_digit",
	"line",
	"our_number",
	"customer_subscription_id",
	"installment_number",
	"installment_id",
	"carne_url",
	"bank_billet_layout_id",
	"remittance_id",
	"created_at",
	"updated_at",
	"paid_bank",
	"paid_agency",
	"tags",
	"tag_list",
	"bank_billet_discharges",
	"bank_billet_remittances"
})
public class Boleto extends Asset {
	
	@JsonProperty("expire_at")
	public String expireAt;
	
	@JsonProperty("paid_at")
	public Object paidAt;
	
	@JsonProperty("description")
	public String description;
	
	@JsonProperty("status")
	public String status;
	
	@JsonProperty("shorten_url")
	public String shortenUrl;
	
	@JsonProperty("customer_person_type")
	public String customerPersonType;
	
	@JsonProperty("customer_person_name")
	public String customerPersonName;
	
	@JsonProperty("customer_cnpj_cpf")
	public String customerCnpjCpf;
	
	@JsonProperty("customer_address")
	public String customerAddress;
	
	@JsonProperty("customer_state")
	public String customerState;
	
	@JsonProperty("customer_neighborhood")
	public String customerNeighborhood;
	
	@JsonProperty("customer_zipcode")
	public String customerZipcode;
	
	@JsonProperty("customer_address_number")
	public Object customerAddressNumber;
	
	@JsonProperty("customer_address_complement")
	public Object customerAddressComplement;
	
	@JsonProperty("customer_phone_number")
	public Object customerPhoneNumber;
	
	@JsonProperty("customer_email")
	public Object customerEmail;
	
	@JsonProperty("created_via_api")
	public Boolean createdViaApi;
	
	@JsonProperty("customer_city_name")
	public String customerCityName;
	
	@JsonProperty("paid_amount")
	public Integer paidAmount;
	
	@JsonProperty("amount")
	public Double amount;
	
	@JsonProperty("url")
	public String url;
	
	@JsonProperty("formats")
	public Formats formats;
	
	@JsonProperty("meta")
	public Object meta;
	
	@JsonProperty("fine_for_delay")
	public Object fineForDelay;
	
	@JsonProperty("fine_type")
	public Integer fineType;
	
	@JsonProperty("fine_percentage")
	public Object finePercentage;
	
	@JsonProperty("fine_value")
	public Object fineValue;
	
	@JsonProperty("late_payment_interest")
	public Object latePaymentInterest;
	
	@JsonProperty("interest_type")
	public Integer interestType;
	
	@JsonProperty("interest_daily_value")
	public Object interestDailyValue;
	
	@JsonProperty("interest_daily_percentage")
	public Object interestDailyPercentage;
	
	@JsonProperty("interest_monthly_percentage")
	public Object interestMonthlyPercentage;
	
	@JsonProperty("discount_type")
	public Integer discountType;
	
	@JsonProperty("discount_limit_date")
	public Object discountLimitDate;
	
	@JsonProperty("discount_value")
	public Object discountValue;
	
	@JsonProperty("discount_percentage")
	public Object discountPercentage;
	
	@JsonProperty("notes")
	public Object notes;
	
	@JsonProperty("bank_rate")
	public Integer bankRate;
	
	@JsonProperty("bank_billet_account_id")
	public Integer bankBilletAccountId;
	
	@JsonProperty("beneficiary_name")
	public String beneficiaryName;
	
	@JsonProperty("beneficiary_cnpj_cpf")
	public String beneficiaryCnpjCpf;
	
	@JsonProperty("beneficiary_address")
	public String beneficiaryAddress;
	
	@JsonProperty("beneficiary_assignor_code")
	public String beneficiaryAssignorCode;
	
	@JsonProperty("guarantor_name")
	public Object guarantorName;
	
	@JsonProperty("guarantor_cnpj_cpf")
	public Object guarantorCnpjCpf;
	
	@JsonProperty("payment_place")
	public String paymentPlace;
	
	@JsonProperty("instructions")
	public Object instructions;
	
	@JsonProperty("document_date")
	public Object documentDate;
	
	@JsonProperty("document_type")
	public String documentType;
	
	@JsonProperty("document_number")
	public Object documentNumber;
	
	@JsonProperty("acceptance")
	public String acceptance;
	
	@JsonProperty("processed_our_number")
	public String processedOurNumber;
	
	@JsonProperty("processed_our_number_raw")
	public String processedOurNumberRaw;
	
	@JsonProperty("bank_contract_slug")
	public String bankContractSlug;
	
	@JsonProperty("agency_number")
	public String agencyNumber;
	
	@JsonProperty("agency_digit")
	public String agencyDigit;
	
	@JsonProperty("account_number")
	public String accountNumber;
	
	@JsonProperty("account_digit")
	public String accountDigit;
	
	@JsonProperty("extra1")
	public String extra1;
	
	@JsonProperty("extra1_digit")
	public Object extra1Digit;
	
	@JsonProperty("extra2")
	public Object extra2;
	
	@JsonProperty("extra2_digit")
	public Object extra2Digit;
	
	@JsonProperty("line")
	public String line;
	
	@JsonProperty("our_number")
	public String ourNumber;
	
	@JsonProperty("customer_subscription_id")
	public Object customerSubscriptionId;
	
	@JsonProperty("installment_number")
	public Object installmentNumber;
	
	@JsonProperty("installment_id")
	public Object installmentId;
	
	@JsonProperty("carne_url")
	public Object carneUrl;
	
	@JsonProperty("bank_billet_layout_id")
	public Object bankBilletLayoutId;
	
	@JsonProperty("remittance_id")
	public Object remittanceId;
	
	@JsonProperty("created_at")
	public String createdAt;
	
	@JsonProperty("updated_at")
	public String updatedAt;
	
	@JsonProperty("paid_bank")
	public Object paidBank;
	
	@JsonProperty("paid_agency")
	public Object paidAgency;
	
	@JsonProperty("tags")
	public List<Object> tags = null;
	
	@JsonProperty("tag_list")
	public String tagList;
	
	@JsonProperty("bank_billet_discharges")
	public List<Object> bankBilletDischarges = null;
	
	@JsonProperty("bank_billet_remittances")
	public List<BankBilletRemittance> bankBilletRemittances = null;

}
