﻿using System;
using System.ComponentModel;
using Xamarin.Forms;


namespace Clinicalpub
{
    // Learn more about making custom code visible in the Xamarin.Forms previewer
    // by visiting https://aka.ms/xamarinforms-previewer
    [DesignTimeVisible(false)]
    public partial class MainPage : ContentPage
    {
        public MainPage()
        {
            InitializeComponent();
            webView.Source = "https://videdental.com/";
        }

        private async void OnBackButtonClicked(object sender, EventArgs e)
        {
            if (webView.CanGoBack)
            {
                webView.GoBack();
            }
            else
            {
                await Navigation.PopAsync();
            }
        }

        private void OnForwardButtonClicked(object sender, EventArgs e)
        {
            webView.Source = "https://videdental.com/";
        }

        private void webView_Navigating(object sender, WebNavigatingEventArgs e)
        {
            if (e.Url == "https://videdental.com/")
            {
                st.IsVisible = false;
            }
            else
            {
                st.IsVisible = true;
            }
        }
    }
}
