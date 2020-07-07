package crc641ae81503223914d3;


public class TitleWebViewRenderer_TitleWebViewClient
	extends android.webkit.WebViewClient
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onPageFinished:(Landroid/webkit/WebView;Ljava/lang/String;)V:GetOnPageFinished_Landroid_webkit_WebView_Ljava_lang_String_Handler\n" +
			"";
		mono.android.Runtime.register ("Clinicalpub.Droid.Resources.TitleWebViewRenderer+TitleWebViewClient, Clinicalpub.Android", TitleWebViewRenderer_TitleWebViewClient.class, __md_methods);
	}


	public TitleWebViewRenderer_TitleWebViewClient ()
	{
		super ();
		if (getClass () == TitleWebViewRenderer_TitleWebViewClient.class)
			mono.android.TypeManager.Activate ("Clinicalpub.Droid.Resources.TitleWebViewRenderer+TitleWebViewClient, Clinicalpub.Android", "", this, new java.lang.Object[] {  });
	}

	public TitleWebViewRenderer_TitleWebViewClient (crc641ae81503223914d3.TitleWebViewRenderer p0)
	{
		super ();
		if (getClass () == TitleWebViewRenderer_TitleWebViewClient.class)
			mono.android.TypeManager.Activate ("Clinicalpub.Droid.Resources.TitleWebViewRenderer+TitleWebViewClient, Clinicalpub.Android", "Clinicalpub.Droid.Resources.TitleWebViewRenderer, Clinicalpub.Android", this, new java.lang.Object[] { p0 });
	}


	public void onPageFinished (android.webkit.WebView p0, java.lang.String p1)
	{
		n_onPageFinished (p0, p1);
	}

	private native void n_onPageFinished (android.webkit.WebView p0, java.lang.String p1);

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
