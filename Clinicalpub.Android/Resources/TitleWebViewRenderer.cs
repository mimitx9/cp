using Android.Webkit;
using Clinicalpub.Models;
using Xamarin.Forms;
using Xamarin.Forms.Platform.Android;
using Clinicalpub.Droid.Resources;

[assembly: ExportRenderer(typeof(TitleWebView), typeof(TitleWebViewRenderer))]
namespace Clinicalpub.Droid.Resources
{
        public class TitleWebViewRenderer : WebViewRenderer
        {
            protected override void OnElementChanged(ElementChangedEventArgs<Xamarin.Forms.WebView> e)
            {
                base.OnElementChanged(e);

                if (e.OldElement == null)
                {
                    Control.SetWebViewClient(new TitleWebViewClient(this));
                }
            }

            internal class TitleWebViewClient : WebViewClient
            {
                readonly TitleWebViewRenderer titleWebViewRenderer;

                internal TitleWebViewClient(TitleWebViewRenderer titleWebViewRenderer)
                {
                    this.titleWebViewRenderer = titleWebViewRenderer;
                }


                public override void OnPageFinished(Android.Webkit.WebView view, string url)
                {
                    base.OnPageFinished(view, url);
                    ((IElementController)titleWebViewRenderer.Element).SetValueFromRenderer(TitleWebView.PageTitleProperty, view.Title);
                }
            }
        }
}