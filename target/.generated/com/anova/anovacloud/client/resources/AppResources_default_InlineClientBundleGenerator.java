package com.anova.anovacloud.client.resources;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class AppResources_default_InlineClientBundleGenerator implements com.anova.anovacloud.client.resources.AppResources {
  private static AppResources_default_InlineClientBundleGenerator _instance0 = new AppResources_default_InlineClientBundleGenerator();
  private void anovaLogoInitializer() {
    anovaLogo = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
      "anovaLogo",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(externalImage),
      0, 0, 53, 48, false, false
    );
  }
  private static class anovaLogoInitializer {
    static {
      _instance0.anovaLogoInitializer();
    }
    static com.google.gwt.resources.client.ImageResource get() {
      return anovaLogo;
    }
  }
  public com.google.gwt.resources.client.ImageResource anovaLogo() {
    return anovaLogoInitializer.get();
  }
  private void bigLogoInitializer() {
    bigLogo = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
      "bigLogo",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(externalImage0),
      0, 0, 87, 80, false, false
    );
  }
  private static class bigLogoInitializer {
    static {
      _instance0.bigLogoInitializer();
    }
    static com.google.gwt.resources.client.ImageResource get() {
      return bigLogo;
    }
  }
  public com.google.gwt.resources.client.ImageResource bigLogo() {
    return bigLogoInitializer.get();
  }
  private void icAddInitializer() {
    icAdd = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
      "icAdd",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(externalImage1),
      0, 0, 24, 24, false, false
    );
  }
  private static class icAddInitializer {
    static {
      _instance0.icAddInitializer();
    }
    static com.google.gwt.resources.client.ImageResource get() {
      return icAdd;
    }
  }
  public com.google.gwt.resources.client.ImageResource icAdd() {
    return icAddInitializer.get();
  }
  private void icDeleteInitializer() {
    icDelete = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
      "icDelete",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(externalImage2),
      0, 0, 24, 24, false, false
    );
  }
  private static class icDeleteInitializer {
    static {
      _instance0.icDeleteInitializer();
    }
    static com.google.gwt.resources.client.ImageResource get() {
      return icDelete;
    }
  }
  public com.google.gwt.resources.client.ImageResource icDelete() {
    return icDeleteInitializer.get();
  }
  private void icDoneInitializer() {
    icDone = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
      "icDone",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(externalImage3),
      0, 0, 24, 24, false, false
    );
  }
  private static class icDoneInitializer {
    static {
      _instance0.icDoneInitializer();
    }
    static com.google.gwt.resources.client.ImageResource get() {
      return icDone;
    }
  }
  public com.google.gwt.resources.client.ImageResource icDone() {
    return icDoneInitializer.get();
  }
  private void icMenuInitializer() {
    icMenu = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
      "icMenu",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(externalImage4),
      0, 0, 24, 24, false, false
    );
  }
  private static class icMenuInitializer {
    static {
      _instance0.icMenuInitializer();
    }
    static com.google.gwt.resources.client.ImageResource get() {
      return icMenu;
    }
  }
  public com.google.gwt.resources.client.ImageResource icMenu() {
    return icMenuInitializer.get();
  }
  private void icUpdateInitializer() {
    icUpdate = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
      "icUpdate",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(externalImage5),
      0, 0, 24, 24, false, false
    );
  }
  private static class icUpdateInitializer {
    static {
      _instance0.icUpdateInitializer();
    }
    static com.google.gwt.resources.client.ImageResource get() {
      return icUpdate;
    }
  }
  public com.google.gwt.resources.client.ImageResource icUpdate() {
    return icUpdateInitializer.get();
  }
  private void logoInitializer() {
    logo = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
      "logo",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(externalImage6),
      0, 0, 40, 40, false, false
    );
  }
  private static class logoInitializer {
    static {
      _instance0.logoInitializer();
    }
    static com.google.gwt.resources.client.ImageResource get() {
      return logo;
    }
  }
  public com.google.gwt.resources.client.ImageResource logo() {
    return logoInitializer.get();
  }
  private void removeSmallInitializer() {
    removeSmall = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
      "removeSmall",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(externalImage7),
      0, 0, 11, 11, false, false
    );
  }
  private static class removeSmallInitializer {
    static {
      _instance0.removeSmallInitializer();
    }
    static com.google.gwt.resources.client.ImageResource get() {
      return removeSmall;
    }
  }
  public com.google.gwt.resources.client.ImageResource removeSmall() {
    return removeSmallInitializer.get();
  }
  private void stylesInitializer() {
    styles = new com.anova.anovacloud.client.resources.AppResources.Styles() {
      private boolean injected;
      public boolean ensureInjected() {
        if (!injected) {
          injected = true;
          com.google.gwt.dom.client.StyleInjector.inject(getText());
          return true;
        }
        return false;
      }
      public String getName() {
        return "styles";
      }
      public String getText() {
        return com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ? (("/* @external gwt-TabBarItem gwt-TabBarItem-wrapper-selected gwt-TabBarFirst gwt-TabBar gwt-TabBarItem-wrapper \n gwt-TabBarRest gwt-TabBarItem-selected; */\n.GFOXD4NDK-com-anova-anovacloud-client-resources-AppResources-Styles-message {\n  position : " + ("relative")  + ";\n  padding : " + ("10px")  + ";\n  margin : " + ("10px"+ " " +"0")  + ";\n  border-radius : " + ("5px")  + ";\n  -webkit-border-radius : " + ("5px")  + ";\n  -moz-border-radius : " + ("5px")  + ";\n  border : " + ("solid"+ " " +"1px")  + ";\n}\n.GFOXD4NDC-com-anova-anovacloud-client-resources-AppResources-Styles-close {\n  position : " + ("absolute")  + ";\n  font-weight : " + ("bold")  + ";\n  top : " + ("5px")  + ";\n  left : ") + (("10px")  + ";\n  padding : " + ("5px")  + ";\n  cursor : " + ("pointer")  + ";\n}\n.GFOXD4NDM-com-anova-anovacloud-client-resources-AppResources-Styles-success {\n  color : " + ("#293a25")  + ";\n  background-color : " + ("#cee4c8")  + ";\n  border-color : " + ("#a2b89e")  + ";\n}\n.GFOXD4NDH-com-anova-anovacloud-client-resources-AppResources-Styles-error {\n  color : " + ("#ff0010")  + ";\n  background-color : " + ("#e4cfc8")  + ";\n  border-color : " + ("#b8a6a3")  + ";\n}\n.GFOXD4NDF-com-anova-anovacloud-client-resources-AppResources-Styles-doneAction {\n  height : " + ((AppResources_default_InlineClientBundleGenerator.this.icDone()).getHeight() + "px")  + ";\n  width : " + ((AppResources_default_InlineClientBundleGenerator.this.icDone()).getWidth() + "px") ) + (";\n  overflow : " + ("hidden")  + ";\n  background : " + ("url(\"" + (AppResources_default_InlineClientBundleGenerator.this.icDone()).getSafeUri().asString() + "\") -" + (AppResources_default_InlineClientBundleGenerator.this.icDone()).getLeft() + "px -" + (AppResources_default_InlineClientBundleGenerator.this.icDone()).getTop() + "px  no-repeat")  + ";\n  border : " + ("none")  + ";\n}\n.GFOXD4NDA-com-anova-anovacloud-client-resources-AppResources-Styles-addAction {\n  height : " + ((AppResources_default_InlineClientBundleGenerator.this.icAdd()).getHeight() + "px")  + ";\n  width : " + ((AppResources_default_InlineClientBundleGenerator.this.icAdd()).getWidth() + "px")  + ";\n  overflow : " + ("hidden")  + ";\n  background : " + ("url(\"" + (AppResources_default_InlineClientBundleGenerator.this.icAdd()).getSafeUri().asString() + "\") -" + (AppResources_default_InlineClientBundleGenerator.this.icAdd()).getLeft() + "px -" + (AppResources_default_InlineClientBundleGenerator.this.icAdd()).getTop() + "px  no-repeat")  + ";\n  border : " + ("none")  + ";\n}\n.GFOXD4NDG-com-anova-anovacloud-client-resources-AppResources-Styles-editAction {\n  height : " + ((AppResources_default_InlineClientBundleGenerator.this.icUpdate()).getHeight() + "px")  + ";\n  width : " + ((AppResources_default_InlineClientBundleGenerator.this.icUpdate()).getWidth() + "px")  + ";\n  overflow : ") + (("hidden")  + ";\n  background : " + ("url(\"" + (AppResources_default_InlineClientBundleGenerator.this.icUpdate()).getSafeUri().asString() + "\") -" + (AppResources_default_InlineClientBundleGenerator.this.icUpdate()).getLeft() + "px -" + (AppResources_default_InlineClientBundleGenerator.this.icUpdate()).getTop() + "px  no-repeat")  + ";\n  border : " + ("none")  + ";\n}\n.GFOXD4NDE-com-anova-anovacloud-client-resources-AppResources-Styles-deleteAction {\n  height : " + ((AppResources_default_InlineClientBundleGenerator.this.icDelete()).getHeight() + "px")  + ";\n  width : " + ((AppResources_default_InlineClientBundleGenerator.this.icDelete()).getWidth() + "px")  + ";\n  overflow : " + ("hidden")  + ";\n  background : " + ("url(\"" + (AppResources_default_InlineClientBundleGenerator.this.icDelete()).getSafeUri().asString() + "\") -" + (AppResources_default_InlineClientBundleGenerator.this.icDelete()).getLeft() + "px -" + (AppResources_default_InlineClientBundleGenerator.this.icDelete()).getTop() + "px  no-repeat")  + ";\n  border : " + ("none")  + ";\n}\n.GFOXD4NDJ-com-anova-anovacloud-client-resources-AppResources-Styles-menuAction {\n  height : " + ((AppResources_default_InlineClientBundleGenerator.this.icMenu()).getHeight() + "px")  + ";\n  width : " + ((AppResources_default_InlineClientBundleGenerator.this.icMenu()).getWidth() + "px")  + ";\n  overflow : " + ("hidden") ) + (";\n  background : " + ("url(\"" + (AppResources_default_InlineClientBundleGenerator.this.icMenu()).getSafeUri().asString() + "\") -" + (AppResources_default_InlineClientBundleGenerator.this.icMenu()).getLeft() + "px -" + (AppResources_default_InlineClientBundleGenerator.this.icMenu()).getTop() + "px  no-repeat")  + ";\n  border : " + ("none")  + ";\n}\n.GFOXD4NDL-com-anova-anovacloud-client-resources-AppResources-Styles-mobileTextField {\n  width : " + ("100%")  + ";\n  border : " + ("none")  + ";\n  border-bottom : " + ("1px"+ " " +"solid"+ " " +"#aeaeae")  + ";\n  padding-bottom : " + ("6px")  + ";\n  font-size : " + ("1.1em")  + ";\n}\n.GFOXD4NDI-com-anova-anovacloud-client-resources-AppResources-Styles-gwt-PopupPanel {\n  background-color : " + ("#fff")  + ";\n  padding : " + ("10px")  + ";\n  height : " + ("auto")  + ";\n  z-index : ") + (("100")  + ";\n  -moz-box-shadow : " + ("0"+ " " +"0"+ " " +"5px"+ " " +"#888")  + ";\n  -webkit-box-shadow : " + ("0"+ " " +"0"+ " " +"5px"+ " " +"#888")  + ";\n  box-shadow : " + ("0"+ " " +"0"+ " " +"5px"+ " " +"#888")  + ";\n}\n.gwt-TabBar {\n  font-family : " + ("\"Droid Sans\""+ ","+ " " +"sans-serif")  + ";\n  background-color : " + ("#545454")  + ";\n  overflow : " + ("hidden")  + ";\n  font-size : " + ("1em")  + ";\n  padding-bottom : " + ("0")  + ";\n  border-collapse : " + ("inherit")  + ";\n}\n.gwt-TabBar .gwt-TabBarItem {\n  background : " + ("none") ) + (";\n  color : " + ("#aeaeae")  + ";\n}\n.gwt-TabBar .gwt-TabBarItem-wrapper {\n  padding : " + ("10px"+ " " +"0")  + ";\n  margin-bottom : " + ("0")  + ";\n  border-bottom : " + ("6px"+ " " +"solid"+ " " +"#545454")  + ";\n  min-width : " + ("120px")  + ";\n}\n.gwt-TabBar .gwt-TabBarItem-selected {\n  background : " + ("none")  + ";\n  color : " + ("#fff")  + ";\n}\n.gwt-TabBar .gwt-TabBarItem-wrapper-selected {\n  background : " + ("none")  + ";\n  border-bottom : " + ("6px"+ " " +"solid"+ " " +"#45a0ec")  + ";\n  margin-bottom : " + ("0")  + ";\n  min-width : ") + (("130px")  + ";\n  position : " + ("relative")  + ";\n}\n.gwt-TabBar .gwt-TabBarItem-wrapper .GFOXD4NDD-com-anova-anovacloud-client-resources-AppResources-Styles-closeButton {\n  display : " + ("none")  + ";\n}\n.gwt-TabBar .gwt-TabBarItem-wrapper-selected .GFOXD4NDD-com-anova-anovacloud-client-resources-AppResources-Styles-closeButton {\n  height : " + ((AppResources_default_InlineClientBundleGenerator.this.removeSmall()).getHeight() + "px")  + ";\n  width : " + ((AppResources_default_InlineClientBundleGenerator.this.removeSmall()).getWidth() + "px")  + ";\n  overflow : " + ("hidden")  + ";\n  background : " + ("url(\"" + (AppResources_default_InlineClientBundleGenerator.this.removeSmall()).getSafeUri().asString() + "\") -" + (AppResources_default_InlineClientBundleGenerator.this.removeSmall()).getLeft() + "px -" + (AppResources_default_InlineClientBundleGenerator.this.removeSmall()).getTop() + "px  no-repeat")  + ";\n  display : " + ("block")  + ";\n  padding : " + ("5px")  + ";\n  background-color : " + ("#910000")  + ";\n  background-position : " + ("center") ) + (";\n  -moz-border-radius : " + ("6px")  + ";\n  -webkit-border-radius : " + ("6px")  + ";\n  border-radius : " + ("6px")  + ";\n  position : " + ("absolute")  + ";\n  top : " + ("10px")  + ";\n  right : " + ("0")  + ";\n}\n.GFOXD4NDB-com-anova-anovacloud-client-resources-AppResources-Styles-bigTitle {\n  color : " + ("#545454")  + ";\n  padding-bottom : " + ("2px")  + ";\n  border-bottom : " + ("1px"+ " " +"solid"+ " " +"#dadada")  + ";\n}\n.GFOXD4NDB-com-anova-anovacloud-client-resources-AppResources-Styles-bigTitle h2 {\n  font-weight : " + ("normal")  + ";\n  float : ") + (("right")  + ";\n  font-size : " + ("25px")  + ";\n  margin : " + ("0")  + ";\n  padding : " + ("0")  + ";\n}\n.GFOXD4NDB-com-anova-anovacloud-client-resources-AppResources-Styles-bigTitle div {\n  float : " + ("left")  + ";\n}\n")) : (("/* @external gwt-TabBarItem gwt-TabBarItem-wrapper-selected gwt-TabBarFirst gwt-TabBar gwt-TabBarItem-wrapper \n gwt-TabBarRest gwt-TabBarItem-selected; */\n.GFOXD4NDK-com-anova-anovacloud-client-resources-AppResources-Styles-message {\n  position : " + ("relative")  + ";\n  padding : " + ("10px")  + ";\n  margin : " + ("10px"+ " " +"0")  + ";\n  border-radius : " + ("5px")  + ";\n  -webkit-border-radius : " + ("5px")  + ";\n  -moz-border-radius : " + ("5px")  + ";\n  border : " + ("solid"+ " " +"1px")  + ";\n}\n.GFOXD4NDC-com-anova-anovacloud-client-resources-AppResources-Styles-close {\n  position : " + ("absolute")  + ";\n  font-weight : " + ("bold")  + ";\n  top : " + ("5px")  + ";\n  right : ") + (("10px")  + ";\n  padding : " + ("5px")  + ";\n  cursor : " + ("pointer")  + ";\n}\n.GFOXD4NDM-com-anova-anovacloud-client-resources-AppResources-Styles-success {\n  color : " + ("#293a25")  + ";\n  background-color : " + ("#cee4c8")  + ";\n  border-color : " + ("#a2b89e")  + ";\n}\n.GFOXD4NDH-com-anova-anovacloud-client-resources-AppResources-Styles-error {\n  color : " + ("#ff0010")  + ";\n  background-color : " + ("#e4cfc8")  + ";\n  border-color : " + ("#b8a6a3")  + ";\n}\n.GFOXD4NDF-com-anova-anovacloud-client-resources-AppResources-Styles-doneAction {\n  height : " + ((AppResources_default_InlineClientBundleGenerator.this.icDone()).getHeight() + "px")  + ";\n  width : " + ((AppResources_default_InlineClientBundleGenerator.this.icDone()).getWidth() + "px") ) + (";\n  overflow : " + ("hidden")  + ";\n  background : " + ("url(\"" + (AppResources_default_InlineClientBundleGenerator.this.icDone()).getSafeUri().asString() + "\") -" + (AppResources_default_InlineClientBundleGenerator.this.icDone()).getLeft() + "px -" + (AppResources_default_InlineClientBundleGenerator.this.icDone()).getTop() + "px  no-repeat")  + ";\n  border : " + ("none")  + ";\n}\n.GFOXD4NDA-com-anova-anovacloud-client-resources-AppResources-Styles-addAction {\n  height : " + ((AppResources_default_InlineClientBundleGenerator.this.icAdd()).getHeight() + "px")  + ";\n  width : " + ((AppResources_default_InlineClientBundleGenerator.this.icAdd()).getWidth() + "px")  + ";\n  overflow : " + ("hidden")  + ";\n  background : " + ("url(\"" + (AppResources_default_InlineClientBundleGenerator.this.icAdd()).getSafeUri().asString() + "\") -" + (AppResources_default_InlineClientBundleGenerator.this.icAdd()).getLeft() + "px -" + (AppResources_default_InlineClientBundleGenerator.this.icAdd()).getTop() + "px  no-repeat")  + ";\n  border : " + ("none")  + ";\n}\n.GFOXD4NDG-com-anova-anovacloud-client-resources-AppResources-Styles-editAction {\n  height : " + ((AppResources_default_InlineClientBundleGenerator.this.icUpdate()).getHeight() + "px")  + ";\n  width : " + ((AppResources_default_InlineClientBundleGenerator.this.icUpdate()).getWidth() + "px")  + ";\n  overflow : ") + (("hidden")  + ";\n  background : " + ("url(\"" + (AppResources_default_InlineClientBundleGenerator.this.icUpdate()).getSafeUri().asString() + "\") -" + (AppResources_default_InlineClientBundleGenerator.this.icUpdate()).getLeft() + "px -" + (AppResources_default_InlineClientBundleGenerator.this.icUpdate()).getTop() + "px  no-repeat")  + ";\n  border : " + ("none")  + ";\n}\n.GFOXD4NDE-com-anova-anovacloud-client-resources-AppResources-Styles-deleteAction {\n  height : " + ((AppResources_default_InlineClientBundleGenerator.this.icDelete()).getHeight() + "px")  + ";\n  width : " + ((AppResources_default_InlineClientBundleGenerator.this.icDelete()).getWidth() + "px")  + ";\n  overflow : " + ("hidden")  + ";\n  background : " + ("url(\"" + (AppResources_default_InlineClientBundleGenerator.this.icDelete()).getSafeUri().asString() + "\") -" + (AppResources_default_InlineClientBundleGenerator.this.icDelete()).getLeft() + "px -" + (AppResources_default_InlineClientBundleGenerator.this.icDelete()).getTop() + "px  no-repeat")  + ";\n  border : " + ("none")  + ";\n}\n.GFOXD4NDJ-com-anova-anovacloud-client-resources-AppResources-Styles-menuAction {\n  height : " + ((AppResources_default_InlineClientBundleGenerator.this.icMenu()).getHeight() + "px")  + ";\n  width : " + ((AppResources_default_InlineClientBundleGenerator.this.icMenu()).getWidth() + "px")  + ";\n  overflow : " + ("hidden") ) + (";\n  background : " + ("url(\"" + (AppResources_default_InlineClientBundleGenerator.this.icMenu()).getSafeUri().asString() + "\") -" + (AppResources_default_InlineClientBundleGenerator.this.icMenu()).getLeft() + "px -" + (AppResources_default_InlineClientBundleGenerator.this.icMenu()).getTop() + "px  no-repeat")  + ";\n  border : " + ("none")  + ";\n}\n.GFOXD4NDL-com-anova-anovacloud-client-resources-AppResources-Styles-mobileTextField {\n  width : " + ("100%")  + ";\n  border : " + ("none")  + ";\n  border-bottom : " + ("1px"+ " " +"solid"+ " " +"#aeaeae")  + ";\n  padding-bottom : " + ("6px")  + ";\n  font-size : " + ("1.1em")  + ";\n}\n.GFOXD4NDI-com-anova-anovacloud-client-resources-AppResources-Styles-gwt-PopupPanel {\n  background-color : " + ("#fff")  + ";\n  padding : " + ("10px")  + ";\n  height : " + ("auto")  + ";\n  z-index : ") + (("100")  + ";\n  -moz-box-shadow : " + ("0"+ " " +"0"+ " " +"5px"+ " " +"#888")  + ";\n  -webkit-box-shadow : " + ("0"+ " " +"0"+ " " +"5px"+ " " +"#888")  + ";\n  box-shadow : " + ("0"+ " " +"0"+ " " +"5px"+ " " +"#888")  + ";\n}\n.gwt-TabBar {\n  font-family : " + ("\"Droid Sans\""+ ","+ " " +"sans-serif")  + ";\n  background-color : " + ("#545454")  + ";\n  overflow : " + ("hidden")  + ";\n  font-size : " + ("1em")  + ";\n  padding-bottom : " + ("0")  + ";\n  border-collapse : " + ("inherit")  + ";\n}\n.gwt-TabBar .gwt-TabBarItem {\n  background : " + ("none") ) + (";\n  color : " + ("#aeaeae")  + ";\n}\n.gwt-TabBar .gwt-TabBarItem-wrapper {\n  padding : " + ("10px"+ " " +"0")  + ";\n  margin-bottom : " + ("0")  + ";\n  border-bottom : " + ("6px"+ " " +"solid"+ " " +"#545454")  + ";\n  min-width : " + ("120px")  + ";\n}\n.gwt-TabBar .gwt-TabBarItem-selected {\n  background : " + ("none")  + ";\n  color : " + ("#fff")  + ";\n}\n.gwt-TabBar .gwt-TabBarItem-wrapper-selected {\n  background : " + ("none")  + ";\n  border-bottom : " + ("6px"+ " " +"solid"+ " " +"#45a0ec")  + ";\n  margin-bottom : " + ("0")  + ";\n  min-width : ") + (("130px")  + ";\n  position : " + ("relative")  + ";\n}\n.gwt-TabBar .gwt-TabBarItem-wrapper .GFOXD4NDD-com-anova-anovacloud-client-resources-AppResources-Styles-closeButton {\n  display : " + ("none")  + ";\n}\n.gwt-TabBar .gwt-TabBarItem-wrapper-selected .GFOXD4NDD-com-anova-anovacloud-client-resources-AppResources-Styles-closeButton {\n  height : " + ((AppResources_default_InlineClientBundleGenerator.this.removeSmall()).getHeight() + "px")  + ";\n  width : " + ((AppResources_default_InlineClientBundleGenerator.this.removeSmall()).getWidth() + "px")  + ";\n  overflow : " + ("hidden")  + ";\n  background : " + ("url(\"" + (AppResources_default_InlineClientBundleGenerator.this.removeSmall()).getSafeUri().asString() + "\") -" + (AppResources_default_InlineClientBundleGenerator.this.removeSmall()).getLeft() + "px -" + (AppResources_default_InlineClientBundleGenerator.this.removeSmall()).getTop() + "px  no-repeat")  + ";\n  display : " + ("block")  + ";\n  padding : " + ("5px")  + ";\n  background-color : " + ("#910000")  + ";\n  background-position : " + ("center") ) + (";\n  -moz-border-radius : " + ("6px")  + ";\n  -webkit-border-radius : " + ("6px")  + ";\n  border-radius : " + ("6px")  + ";\n  position : " + ("absolute")  + ";\n  top : " + ("10px")  + ";\n  left : " + ("0")  + ";\n}\n.GFOXD4NDB-com-anova-anovacloud-client-resources-AppResources-Styles-bigTitle {\n  color : " + ("#545454")  + ";\n  padding-bottom : " + ("2px")  + ";\n  border-bottom : " + ("1px"+ " " +"solid"+ " " +"#dadada")  + ";\n}\n.GFOXD4NDB-com-anova-anovacloud-client-resources-AppResources-Styles-bigTitle h2 {\n  font-weight : " + ("normal")  + ";\n  float : ") + (("left")  + ";\n  font-size : " + ("25px")  + ";\n  margin : " + ("0")  + ";\n  padding : " + ("0")  + ";\n}\n.GFOXD4NDB-com-anova-anovacloud-client-resources-AppResources-Styles-bigTitle div {\n  float : " + ("right")  + ";\n}\n"));
      }
      public java.lang.String addAction() {
        return "GFOXD4NDA-com-anova-anovacloud-client-resources-AppResources-Styles-addAction";
      }
      public java.lang.String bigTitle() {
        return "GFOXD4NDB-com-anova-anovacloud-client-resources-AppResources-Styles-bigTitle";
      }
      public java.lang.String close() {
        return "GFOXD4NDC-com-anova-anovacloud-client-resources-AppResources-Styles-close";
      }
      public java.lang.String closeButton() {
        return "GFOXD4NDD-com-anova-anovacloud-client-resources-AppResources-Styles-closeButton";
      }
      public java.lang.String deleteAction() {
        return "GFOXD4NDE-com-anova-anovacloud-client-resources-AppResources-Styles-deleteAction";
      }
      public java.lang.String doneAction() {
        return "GFOXD4NDF-com-anova-anovacloud-client-resources-AppResources-Styles-doneAction";
      }
      public java.lang.String editAction() {
        return "GFOXD4NDG-com-anova-anovacloud-client-resources-AppResources-Styles-editAction";
      }
      public java.lang.String error() {
        return "GFOXD4NDH-com-anova-anovacloud-client-resources-AppResources-Styles-error";
      }
      public java.lang.String gwtPopupPanel() {
        return "GFOXD4NDI-com-anova-anovacloud-client-resources-AppResources-Styles-gwt-PopupPanel";
      }
      public java.lang.String menuAction() {
        return "GFOXD4NDJ-com-anova-anovacloud-client-resources-AppResources-Styles-menuAction";
      }
      public java.lang.String message() {
        return "GFOXD4NDK-com-anova-anovacloud-client-resources-AppResources-Styles-message";
      }
      public java.lang.String mobileTextField() {
        return "GFOXD4NDL-com-anova-anovacloud-client-resources-AppResources-Styles-mobileTextField";
      }
      public java.lang.String success() {
        return "GFOXD4NDM-com-anova-anovacloud-client-resources-AppResources-Styles-success";
      }
    }
    ;
  }
  private static class stylesInitializer {
    static {
      _instance0.stylesInitializer();
    }
    static com.anova.anovacloud.client.resources.AppResources.Styles get() {
      return styles;
    }
  }
  public com.anova.anovacloud.client.resources.AppResources.Styles styles() {
    return stylesInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static final java.lang.String externalImage = "data:image/png;base64,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";
  private static final java.lang.String externalImage0 = "data:image/png;base64,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";
  private static final java.lang.String externalImage1 = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABgAAAAYCAYAAADgdz34AAAA2klEQVR42u1WwQqCQBAdOnSsfqDfSIjOgbDLbge/Z//Vs2CCIBZU88SDyWwbrEKEC4+VeTPvLTqjEgVWmqYbrU2ulLkOgRg4il3W2h2LtYznCC24aIMsy7b9id8MEAO3GPyHwZoFS6GLSnD0TZ/jJD4YY/YsVgkGFbhPtd2cSEM0GiiIPwQDxKpAbU6eIZoKLUkPcCpAe34DvmhmvEUNDArG3YNbv/sEhjkSCuJWS5S6nHg/jqGUPWhtz5xYC+I1OOTItZ1mEpwT59zKN2jglnfRYvADH/3Y35YX7/Qkud+Sra4AAAAASUVORK5CYII=";
  private static final java.lang.String externalImage2 = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABgAAAAYCAYAAADgdz34AAAAyUlEQVR42mNgQAKenqGivr7+x4B4IgOJAKQHpBdkBlYFgYGBwkAFR4D4PxS3kGB4C5K+IyCzMAz38fE/iqSIaEvQDAdjkFlwS4KCgiSBgmewGE7QEmyGI+EzILOBigJO4VEExn5+AQ3ohoPECOkDmQ20wK+fsEJUS4gzHIT9+knSAFJHiloyvEwcxhakxEQasbiF5GRHNcMptKSFpKxPSpzgDPMBs4CmQUTTSKZpMqVpRqNpUUHzwo7mxTXNKxyaV5l0qfRp2WwBAINwrvuPIu9HAAAAAElFTkSuQmCC";
  private static final java.lang.String externalImage3 = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABgAAAAYCAYAAADgdz34AAABS0lEQVR42mNgGAVQ4Ofnx+vrG3DS19e/heqGBwYGCvv6+R/39Qv4D8I+foFFVDPc29tb0Mcv4CjMcCRLMig23MHBgQXo8u3ohsOxr38J2Yb7+vpy4TUcgu+S6fIEDmIMB0a8CopGH39/L6DEgtDQUGa8rvcPWIPf8MAnQB9qo2jyCggwAEo+g0SQ//L6+nomdINBYkD5ZQRc/sbf398cLSUE6gC9/Bw1ggJWYIZ7wAoChr8AGq6LpinIFCjxGnsqCJyHUBc4j5DLfQICzDDD0y/gNl6NvoF9YIzf8K9Al7vgiLDAPAKaCeGPQMOtCJQjAflkGv7FxyfAmciM419OouF/gMk6kMTc6V9CpOE/QXmGrFwKLLjqCbnczy8wiKJCDBjxrbhTVUAsVYphbJYAi+BoqlYkQEP74Yb7+yfSpCoEFmxTgcm4bOQ2BgAqBHys1IBkkgAAAABJRU5ErkJggg==";
  private static final java.lang.String externalImage4 = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABgAAAAYCAYAAADgdz34AAAAwUlEQVR42mNgGBFg1qxZc2bOnHl2xowZm4H0PiA+DMQTqWYB0LCbQPwfDV+mpgXn0S0A+uY4NS24hG4BMNhOUtOC61iC6ALVLAAGRwjQwDwgHQOkU4A4HegDn6GTTIEuNpo9e7bT9OnTzYDYGsi2BYrpUtOCy1ji4DQ1LbhA61R0DosPjg2dZAo0rB+IdwPxciBeDy2TWhlGAVIQrQLiO0B8EYivQkvXRdS04A6WSL46pJLpRVpnNGw12sWhUydTAgBYvRlibZoNbgAAAABJRU5ErkJggg==";
  private static final java.lang.String externalImage5 = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABgAAAAYCAYAAADgdz34AAABMElEQVR42mNgIBP4+PjI+fr6d/j5+T/28fH/AMIgNkgMJMdACfDz87MDGvQMiP/jwM98fAItyXS5vxfQgJ94DIfhLyT7BOhyD6DGz0QYDsPdpBjuCHIVsgE+Pn5FPj4BbXgseEJJsJTD5H19/abhsOAbWcHi5xdQhq4OKD6RZAuwBQtQrBK3ev8uooOIULBgtyCgmKhIJjZY0IKoHM3wz1iTKanBAtVTiZ4HgGLW1AqWMnSXg0KAVsHyE+RIWgaLI32DBZoLX9EkWJA0fCPe5UQGC1oQfYAq/gtkhwM1mPj7+5s7ODiwkB0sOCwA4d9A/AuI3wQEBAiQHSx4LMAopMgKFiIs+AQs582AchVkBQsRFvzDknSJDxa0VERU/UpSsKBZ8AjW7MCGQWU6ycGCBABFAuV2yZpUzQAAAABJRU5ErkJggg==";
  private static final java.lang.String externalImage6 = "data:image/png;base64,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";
  private static final java.lang.String externalImage7 = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAsAAAALCAYAAACprHcmAAAAdElEQVR42n2Q0Q3AIAhE2YBRHKUjMIIjOVJHcISOQFGxoSi+5D5M7pADQGDmIrpFCAZ5k+gRJTDGyRdQ42QE1MAukHnlambcBDxkdzsFCDzB19WX9mV40wFPxroN6Fl+OwYdcjMnE6CgdLE7p37HtTT2icoLK89h1O3Mlw4AAAAASUVORK5CYII=";
  private static com.google.gwt.resources.client.ImageResource anovaLogo;
  private static com.google.gwt.resources.client.ImageResource bigLogo;
  private static com.google.gwt.resources.client.ImageResource icAdd;
  private static com.google.gwt.resources.client.ImageResource icDelete;
  private static com.google.gwt.resources.client.ImageResource icDone;
  private static com.google.gwt.resources.client.ImageResource icMenu;
  private static com.google.gwt.resources.client.ImageResource icUpdate;
  private static com.google.gwt.resources.client.ImageResource logo;
  private static com.google.gwt.resources.client.ImageResource removeSmall;
  private static com.anova.anovacloud.client.resources.AppResources.Styles styles;
  
  public ResourcePrototype[] getResources() {
    return new ResourcePrototype[] {
      anovaLogo(), 
      bigLogo(), 
      icAdd(), 
      icDelete(), 
      icDone(), 
      icMenu(), 
      icUpdate(), 
      logo(), 
      removeSmall(), 
      styles(), 
    };
  }
  public ResourcePrototype getResource(String name) {
    if (GWT.isScript()) {
      return getResourceNative(name);
    } else {
      if (resourceMap == null) {
        resourceMap = new java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype>();
        resourceMap.put("anovaLogo", anovaLogo());
        resourceMap.put("bigLogo", bigLogo());
        resourceMap.put("icAdd", icAdd());
        resourceMap.put("icDelete", icDelete());
        resourceMap.put("icDone", icDone());
        resourceMap.put("icMenu", icMenu());
        resourceMap.put("icUpdate", icUpdate());
        resourceMap.put("logo", logo());
        resourceMap.put("removeSmall", removeSmall());
        resourceMap.put("styles", styles());
      }
      return resourceMap.get(name);
    }
  }
  private native ResourcePrototype getResourceNative(String name) /*-{
    switch (name) {
      case 'anovaLogo': return this.@com.anova.anovacloud.client.resources.AppResources::anovaLogo()();
      case 'bigLogo': return this.@com.anova.anovacloud.client.resources.AppResources::bigLogo()();
      case 'icAdd': return this.@com.anova.anovacloud.client.resources.AppResources::icAdd()();
      case 'icDelete': return this.@com.anova.anovacloud.client.resources.AppResources::icDelete()();
      case 'icDone': return this.@com.anova.anovacloud.client.resources.AppResources::icDone()();
      case 'icMenu': return this.@com.anova.anovacloud.client.resources.AppResources::icMenu()();
      case 'icUpdate': return this.@com.anova.anovacloud.client.resources.AppResources::icUpdate()();
      case 'logo': return this.@com.anova.anovacloud.client.resources.AppResources::logo()();
      case 'removeSmall': return this.@com.anova.anovacloud.client.resources.AppResources::removeSmall()();
      case 'styles': return this.@com.anova.anovacloud.client.resources.AppResources::styles()();
    }
    return null;
  }-*/;
}
