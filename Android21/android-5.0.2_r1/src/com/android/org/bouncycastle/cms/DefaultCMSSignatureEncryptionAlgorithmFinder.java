package com.android.org.bouncycastle.cms;

import java.util.HashSet;
import java.util.Set;

import com.android.org.bouncycastle.asn1.DERNull;
import com.android.org.bouncycastle.asn1.oiw.OIWObjectIdentifiers;
import com.android.org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import com.android.org.bouncycastle.asn1.teletrust.TeleTrusTObjectIdentifiers;
import com.android.org.bouncycastle.asn1.x509.AlgorithmIdentifier;

public class DefaultCMSSignatureEncryptionAlgorithmFinder
    implements CMSSignatureEncryptionAlgorithmFinder
{
    private static final Set RSA_PKCS1d5 = new HashSet();

    static
    {
        // BEGIN android-removed
        // RSA_PKCS1d5.add(PKCSObjectIdentifiers.md2WithRSAEncryption);
        // RSA_PKCS1d5.add(PKCSObjectIdentifiers.md4WithRSAEncryption);
        // END android-removed
        RSA_PKCS1d5.add(PKCSObjectIdentifiers.md5WithRSAEncryption);
        RSA_PKCS1d5.add(PKCSObjectIdentifiers.sha1WithRSAEncryption);
        RSA_PKCS1d5.add(PKCSObjectIdentifiers.sha224WithRSAEncryption);
        RSA_PKCS1d5.add(PKCSObjectIdentifiers.sha256WithRSAEncryption);
        RSA_PKCS1d5.add(PKCSObjectIdentifiers.sha384WithRSAEncryption);
        RSA_PKCS1d5.add(PKCSObjectIdentifiers.sha512WithRSAEncryption);
        // BEGIN android-removed
        // RSA_PKCS1d5.add(OIWObjectIdentifiers.md4WithRSAEncryption);
        // RSA_PKCS1d5.add(OIWObjectIdentifiers.md4WithRSA);
        // END android-removed
        RSA_PKCS1d5.add(OIWObjectIdentifiers.md5WithRSA);
        RSA_PKCS1d5.add(OIWObjectIdentifiers.sha1WithRSA);
        // BEGIN android-removed
        // RSA_PKCS1d5.add(TeleTrusTObjectIdentifiers.rsaSignatureWithripemd128);
        // RSA_PKCS1d5.add(TeleTrusTObjectIdentifiers.rsaSignatureWithripemd160);
        // RSA_PKCS1d5.add(TeleTrusTObjectIdentifiers.rsaSignatureWithripemd256);
        // END android-removed
    }

    public AlgorithmIdentifier findEncryptionAlgorithm(AlgorithmIdentifier signatureAlgorithm)
    {
               // RFC3370 section 3.2
        if (RSA_PKCS1d5.contains(signatureAlgorithm.getAlgorithm()))
        {
            return new AlgorithmIdentifier(PKCSObjectIdentifiers.rsaEncryption, DERNull.INSTANCE);
        }

        return signatureAlgorithm;
    }
}
