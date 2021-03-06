package com.common;



public class Test {
	 static String mergeStrings(String a, String b) {

		    if (a == null || a.length() == 0) {
		            return b;
		        } else if (b == null || b.length() == 0) {
		            return a;
		        } else {
		            final int aLength = a.length();
		            final int bLength = b.length();
		            final StringBuilder merged = new StringBuilder(aLength + bLength);

		            for (int i = 0, j = 0; i < aLength && j < bLength; i++, j++) {
		                merged.append(a.charAt(i)).append(b.charAt(j));
		            }

		            if (aLength != bLength) {
		                if (aLength > bLength) {
		                    merged.append(a.substring(bLength));
		                } else {
		                    merged.append(b.substring(aLength));
		                }
		            }

		            return merged.toString();
		        }
		    }
		    
 public static void main(String[] args) {

			String  s="{\"payload\":{\"test_mode\":false,\"order_details\":[{\"order_number\":\"123456789012223_SPR05_GM\",\"order_type\":\"GM\",\"order_amount\":10}],\"payment_details\":[{\"pi_blob\":\"{\\\"payment_details\\\":{\\\"pm_id\\\":\\\"MASTERCARD\\\",\\\"save_to_profile\\\":\\\"Y\\\",\\\"card\\\":{\\\"last_4_digits\\\":\\\"1471\\\",\\\"type\\\":\\\"CREDIT_CARD\\\"},\\\"customer\\\":{\\\"address\\\":{\\\"address1\\\":\\\"35 Exhibition Cres\\\",\\\"city\\\":\\\"Brampton\\\",\\\"country_code\\\":\\\"CA\\\",\\\"postal_code\\\":\\\"L7A 4C1\\\",\\\"state_or_province_code\\\":\\\"ON\\\"},\\\"first_name\\\":\\\"John\\\",\\\"last_name\\\":\\\"Doe\\\"},\\\"payment_token\\\": {\"version\":\"EC_v1\",\"data\":\"tD0StqzWJvmLPnXVoSby9vCpeCi9B+XeBj9Lr8jTBELWSCy4FomRrBpS1/ivlEGXoD28GIF7vdzFuBeLF8DnhQUh54P8ZMX93PgoPDC8fjpy6wzeaq2cPPIoVeBA3qprUpbR5Gtw6CiSYAJv19XIlq45sPTXlWzmdvH6BrtmKQQLYe7qezV4kxQ0Q69IFklQ2MlcxWPckAk6I8YM5Xc1FstgGIyJxr4EFTPiv77rdggpZeMHtLA6aqy3i49YkhskUfYqs0eoEuV4+/VVPvg9aCPW4rNJPJ/e70hU1FwKbfw+zNLkqGgJx3Ov9sJaLajTkLfkwWW4I9skg/1wh/ra1FvDbvZ5MLgIhARV5RMeVEXba5HF/W4XgMkdOt84FFj7nH5uf/eoi4ZbYTDUxw==\",\"signature\":\"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\",\"header\":{\"ephemeralPublicKey\":\"MFkwEwYHKoZIzj0CAQYIKoZIzj0DAQcDQgAEFEiJGslgVqCAw/poNRQQcbPhjwucLZBr82gahD5AD9jyTO7j/5m5Hn/5LVuFH15NFCUXABq9UUpkbbnq3oA+7Q==\",\"publicKeyHash\":\"vzK1GpPk+CKdjoaYaWaiA9XlagUrUVNboqO4XJu4Plw=\",\"transactionId\":\"72def589338b4edff6c59de67cc7ed49a997194b3bec0e51a4d07ab5af604fa0\"}}\\\"\\\",\\\"wallet\\\":\\\"APPLEPAY\\\"}}\",\"credential_on_file\":{\"initiation_indicator\":\"C\",\"type_indicator\":\"C\"}}]}}";
		  
			System.out.println(s);

}
}