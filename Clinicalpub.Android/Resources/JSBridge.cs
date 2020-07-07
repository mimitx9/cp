using System;
using Android.Webkit;
using Clinicalpub.Models;
using Java.Interop;


namespace Clinicalpub.Droid.Resources
{
    public class JSBridge : Java.Lang.Object
    {
        readonly WeakReference<MyWebViewRenderer> MyWebViewRenderer;

        public JSBridge(MyWebViewRenderer MyRenderer)
        {
            MyWebViewRenderer = new WeakReference<MyWebViewRenderer>(MyRenderer);
        }

        [JavascriptInterface]
        [Export("invokeAction")]
        public void InvokeAction(string data)
        {
            MyWebViewRenderer MyRenderer;

            if (MyWebViewRenderer != null && MyWebViewRenderer.TryGetTarget(out MyRenderer))
            {
                ((MyWebView)MyRenderer.Element).InvokeAction(data);
            }
        }
    }
}