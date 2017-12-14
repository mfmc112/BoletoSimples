package com.boleto.asset;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;
import org.codehaus.jackson.map.annotate.JsonSerialize;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
@JsonPropertyOrder({
	"id",
	"login_url",
	"email",
	"account_type",
	"first_name",
	"middle_name",
	"last_name",
	"full_name",
	"cpf",
	"date_of_birth",
	"mother_name",
	"father_name",
	"account_level",
	"phone_number",
	"address_street_name",
	"address_number",
	"address_complement",
	"address_neighborhood",
	"address_postal_code",
	"address_city_name",
	"address_state",
	"business_name",
	"business_cnpj",
	"business_legal_name",
	"simple_opting",
	"balance_cents",
	"checkout_url",
	"subscription"
})
public class UserInfo extends Asset {
	
	@JsonProperty("login_url")
	public String loginUrl;
	
	@JsonProperty("email")
	public String email;
	
	@JsonProperty("account_type")
	public String accountType;
	
	@JsonProperty("first_name")
	public String firstName;
	
	@JsonProperty("middle_name")
	public String middleName;
	
	@JsonProperty("last_name")
	public String lastName;
	
	@JsonProperty("full_name")
	public String fullName;
	
	@JsonProperty("cpf")
	public String cpf;
	
	@JsonProperty("date_of_birth")
	public String dateOfBirth;
	
	@JsonProperty("mother_name")
	public Object motherName;
	
	@JsonProperty("father_name")
	public Object fatherName;
	
	@JsonProperty("account_level")
	public Integer accountLevel;
	
	@JsonProperty("phone_number")
	public String phoneNumber;
	
	@JsonProperty("address_street_name")
	public String addressStreetName;
	
	@JsonProperty("address_number")
	public String addressNumber;
	
	@JsonProperty("address_complement")
	public Object addressComplement;
	
	@JsonProperty("address_neighborhood")
	public String addressNeighborhood;
	
	@JsonProperty("address_postal_code")
	public String addressPostalCode;
	
	@JsonProperty("address_city_name")
	public String addressCityName;
	
	@JsonProperty("address_state")
	public String addressState;
	
	@JsonProperty("business_name")
	public String businessName;
	
	@JsonProperty("business_cnpj")
	public String businessCnpj;
	
	@JsonProperty("business_legal_name")
	public String businessLegalName;
	
	@JsonProperty("simple_opting")
	public Boolean simpleOpting;
	
	@JsonProperty("balance_cents")
	public Integer balanceCents;
	
	@JsonProperty("checkout_url")
	public String checkoutUrl;
	
	@JsonProperty("subscription")
	public Object subscription;
	
}
