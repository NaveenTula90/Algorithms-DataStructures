package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SecureHashAlgorithm
{

	private static final String SHA_ALG = "SHA-512";

	public static void main(String... args)
	{
		System.out.println("Enter Password:");
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in, StandardCharsets.UTF_8)))
		{
			final byte[] hashedValue = MessageDigest.getInstance(SHA_ALG).digest(br.readLine().trim().getBytes());
			String hashedString = IntStream.range(0, hashedValue.length).map(r -> hashedValue[r]).mapToObj(r ->
			{
				String hex = Integer.toHexString(r & 0xFF);
				return r >= 0 && r <= 15 ? '0' + hex : hex;
			}).collect(Collectors.joining());
			System.out.printf("\nhashedString is: %s", hashedString);
		} catch (NoSuchAlgorithmException | IOException e)
		{
			e.printStackTrace();
		}
	}
}
