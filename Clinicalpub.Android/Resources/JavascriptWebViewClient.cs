using Android.Webkit;
using Xamarin.Forms.Platform.Android;

namespace Clinicalpub.Droid.Resources
{
    public class JavascriptWebViewClient : FormsWebViewClient
    {
        string _javascript;

        public JavascriptWebViewClient(MyWebViewRenderer renderer, string javascript) : base(renderer)
        {
            _javascript = javascript;
        }

        public override void OnPageFinished(WebView view, string url)
        {
            base.OnPageFinished(view, url);
            view.EvaluateJavascript(_javascript, null);
        }
    }
}