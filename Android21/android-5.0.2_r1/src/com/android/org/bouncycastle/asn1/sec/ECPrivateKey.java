package com.android.org.bouncycastle.asn1.sec;

import java.math.BigInteger;
import java.util.Enumeration;

import com.android.org.bouncycastle.asn1.ASN1Encodable;
import com.android.org.bouncycastle.asn1.ASN1EncodableVector;
import com.android.org.bouncycastle.asn1.ASN1Integer;
import com.android.org.bouncycastle.asn1.ASN1Object;
import com.android.org.bouncycastle.asn1.ASN1OctetString;
import com.android.org.bouncycastle.asn1.ASN1Primitive;
import com.android.org.bouncycastle.asn1.ASN1Sequence;
import com.android.org.bouncycastle.asn1.ASN1TaggedObject;
import com.android.org.bouncycastle.asn1.DERBitString;
import com.android.org.bouncycastle.asn1.DEROctetString;
import com.android.org.bouncycastle.asn1.DERSequence;
import com.android.org.bouncycastle.asn1.DERTaggedObject;
import com.android.org.bouncycastle.util.BigIntegers;

/**
 * the elliptic curve private key object from SEC 1
 */
public class ECPrivateKey
    extends ASN1Object
{
    private ASN1Sequence seq;

    private ECPrivateKey(
        ASN1Sequence seq)
    {
        this.seq = seq;
    }

    public static ECPrivateKey getInstance(
        Object obj)
    {
        if (obj instanceof ECPrivateKey)
        {
            return (ECPrivateKey)obj;
        }

        if (obj != null)
        {
            return new ECPrivateKey(ASN1Sequence.getInstance(obj));
        }

        return null;
    }

    public ECPrivateKey(
        BigInteger key)
    {
        byte[] bytes = BigIntegers.asUnsignedByteArray(key);

        ASN1EncodableVector v = new ASN1EncodableVector();

        v.add(new ASN1Integer(1));
        v.add(new DEROctetString(bytes));

        seq = new DERSequence(v);
    }

    public ECPrivateKey(
        BigInteger key,
        ASN1Encodable parameters)
    {
        this(key, null, parameters);
    }

    public ECPrivateKey(
        BigInteger key,
        DERBitString publicKey,
        ASN1Encodable parameters)
    {
        byte[] bytes = BigIntegers.asUnsignedByteArray(key);

        ASN1EncodableVector v = new ASN1EncodableVector();

        v.add(new ASN1Integer(1));
        v.add(new DEROctetString(bytes));

        if (parameters != null)
        {
            v.add(new DERTaggedObject(true, 0, parameters));
        }

        if (publicKey != null)
        {
            v.add(new DERTaggedObject(true, 1, publicKey));
        }

        seq = new DERSequence(v);
    }

    public BigInteger getKey()
    {
        ASN1OctetString octs = (ASN1OctetString)seq.getObjectAt(1);

        return new BigInteger(1, octs.getOctets());
    }

    public DERBitString getPublicKey()
    {
        return (DERBitString)getObjectInTag(1);
    }

    public ASN1Primitive getParameters()
    {
        return getObjectInTag(0);
    }

    private ASN1Primitive getObjectInTag(int tagNo)
    {
        Enumeration e = seq.getObjects();

        while (e.hasMoreElements())
        {
            ASN1Encodable obj = (ASN1Encodable)e.nextElement();

            if (obj instanceof ASN1TaggedObject)
            {
                ASN1TaggedObject tag = (ASN1TaggedObject)obj;
                if (tag.getTagNo() == tagNo)
                {
                    return tag.getObject().toASN1Primitive();
                }
            }
        }
        return null;
    }

    /**
     * ECPrivateKey ::= SEQUENCE {
     *     version INTEGER { ecPrivkeyVer1(1) } (ecPrivkeyVer1),
     *     privateKey OCTET STRING,
     *     parameters [0] Parameters OPTIONAL,
     *     publicKey [1] BIT STRING OPTIONAL }
     */
    public ASN1Primitive toASN1Primitive()
    {
        return seq;
    }
}
