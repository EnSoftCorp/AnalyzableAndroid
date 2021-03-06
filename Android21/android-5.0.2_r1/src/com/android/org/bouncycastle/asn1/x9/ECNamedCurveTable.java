package com.android.org.bouncycastle.asn1.x9;

import java.util.Enumeration;
import java.util.Vector;

import com.android.org.bouncycastle.asn1.ASN1ObjectIdentifier;
import com.android.org.bouncycastle.asn1.nist.NISTNamedCurves;
import com.android.org.bouncycastle.asn1.sec.SECNamedCurves;
// BEGIN android-removed
// import com.android.org.bouncycastle.asn1.teletrust.TeleTrusTNamedCurves;
// END android-removed

/**
 * A general class that reads all X9.62 style EC curve tables.
 */
public class ECNamedCurveTable
{
    /**
     * return a X9ECParameters object representing the passed in named
     * curve. The routine returns null if the curve is not present.
     *
     * @param name the name of the curve requested
     * @return an X9ECParameters object or null if the curve is not available.
     */
    public static X9ECParameters getByName(
        String name)
    {
        X9ECParameters ecP = X962NamedCurves.getByName(name);

        if (ecP == null)
        {
            ecP = SECNamedCurves.getByName(name);
        }

        // BEGIN android-removed
        // if (ecP == null)
        // {
        //     ecP = TeleTrusTNamedCurves.getByName(name);
        // }
        // END android-removed

        if (ecP == null)
        {
            ecP = NISTNamedCurves.getByName(name);
        }

        return ecP;
    }

    /**
     * return a X9ECParameters object representing the passed in named
     * curve.
     *
     * @param oid the object id of the curve requested
     * @return an X9ECParameters object or null if the curve is not available.
     */
    public static X9ECParameters getByOID(
        ASN1ObjectIdentifier oid)
    {
        X9ECParameters ecP = X962NamedCurves.getByOID(oid);

        if (ecP == null)
        {
            ecP = SECNamedCurves.getByOID(oid);
        }

        // BEGIN android-removed
        // if (ecP == null)
        // {
        //     ecP = TeleTrusTNamedCurves.getByOID(oid);
        // }
        // END android-removed

        // NOTE: All the NIST curves are currently from SEC, so no point in redundant OID lookup

        return ecP;
    }

    /**
     * return an enumeration of the names of the available curves.
     *
     * @return an enumeration of the names of the available curves.
     */
    public static Enumeration getNames()
    {
        Vector v = new Vector();

        addEnumeration(v, X962NamedCurves.getNames());
        addEnumeration(v, SECNamedCurves.getNames());
        addEnumeration(v, NISTNamedCurves.getNames());
        // BEGIN android-removed
        // addEnumeration(v, TeleTrusTNamedCurves.getNames());
        // END android-removed

        return v.elements();
    }

    private static void addEnumeration(
        Vector v,
        Enumeration e)
    {
        while (e.hasMoreElements())
        {
            v.addElement(e.nextElement());
        }
    }
}
