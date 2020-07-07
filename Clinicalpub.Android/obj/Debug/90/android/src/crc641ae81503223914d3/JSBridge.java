package crc641ae81503223914d3;


public class JSBridge
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_InvokeAction:(Ljava/lang/String;)V:__export__\n" +
			"";
		mono.android.Runtime.register ("Clinicalpub.Droid.Resources.JSBridge, Clinicalpub.Android", JSBridge.class, __md_methods);
	}


	public JSBridge ()
	{
		super ();
		if (getClass () == JSBridge.class)
			mono.android.TypeManager.Activate ("Clinicalpub.Droid.Resources.JSBridge, Clinicalpub.Android", "", this, new java.lang.Object[] {  });
	}

	public JSBridge (crc641ae81503223914d3.MyWebViewRenderer p0)
	{
		super ();
		if (getClass () == JSBridge.class)
			mono.android.TypeManager.Activate ("Clinicalpub.Droid.Resources.JSBridge, Clinicalpub.Android", "Clinicalpub.Droid.Resources.MyWebViewRenderer, Clinicalpub.Android", this, new java.lang.Object[] { p0 });
	}

	@android.webkit.JavascriptInterface

	public void invokeAction (java.lang.String p0)
	{
		n_InvokeAction (p0);
	}

	private native void n_InvokeAction (java.lang.String p0);

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
