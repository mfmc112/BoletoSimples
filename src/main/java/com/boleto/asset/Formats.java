package com.boleto.asset;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;
import org.codehaus.jackson.map.annotate.JsonSerialize;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
@JsonPropertyOrder({
	"png",
	"pdf"
})
public class Formats {
	
	@JsonProperty("png")
	public String png;
	
	@JsonProperty("pdf")
	public String pdf;

}


