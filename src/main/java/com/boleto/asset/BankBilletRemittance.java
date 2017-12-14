package com.boleto.asset;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;
import org.codehaus.jackson.map.annotate.JsonSerialize;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
@JsonPropertyOrder({
	"id",
	"our_code",
	"occurrence",
	"remittance_id",
	"bank_billet_id",
	"bank_billet_account_id",
	"processed_at",
	"occurrence_detail",
	"created_at"
})
public class BankBilletRemittance {
	
	@JsonProperty("id")
	public Integer id;
	
	@JsonProperty("our_code")
	public String ourCode;
	
	@JsonProperty("occurrence")
	public String occurrence;
	
	@JsonProperty("remittance_id")
	public Object remittanceId;
	
	@JsonProperty("bank_billet_id")
	public Integer bankBilletId;
	
	@JsonProperty("bank_billet_account_id")
	public Integer bankBilletAccountId;
	
	@JsonProperty("processed_at")
	public Object processedAt;
	
	@JsonProperty("occurrence_detail")
	public String occurrenceDetail;
	
	@JsonProperty("created_at")
	public String createdAt;

}