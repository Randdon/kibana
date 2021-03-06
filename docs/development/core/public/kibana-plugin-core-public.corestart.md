<!-- Do not edit this file. It is automatically generated by API Documenter. -->

[Home](./index.md) &gt; [kibana-plugin-core-public](./kibana-plugin-core-public.md) &gt; [CoreStart](./kibana-plugin-core-public.corestart.md)

## CoreStart interface

Core services exposed to the `Plugin` start lifecycle

<b>Signature:</b>

```typescript
export interface CoreStart 
```

## Properties

|  Property | Type | Description |
|  --- | --- | --- |
|  [application](./kibana-plugin-core-public.corestart.application.md) | <code>ApplicationStart</code> | [ApplicationStart](./kibana-plugin-core-public.applicationstart.md) |
|  [chrome](./kibana-plugin-core-public.corestart.chrome.md) | <code>ChromeStart</code> | [ChromeStart](./kibana-plugin-core-public.chromestart.md) |
|  [docLinks](./kibana-plugin-core-public.corestart.doclinks.md) | <code>DocLinksStart</code> | [DocLinksStart](./kibana-plugin-core-public.doclinksstart.md) |
|  [fatalErrors](./kibana-plugin-core-public.corestart.fatalerrors.md) | <code>FatalErrorsStart</code> | [FatalErrorsStart](./kibana-plugin-core-public.fatalerrorsstart.md) |
|  [http](./kibana-plugin-core-public.corestart.http.md) | <code>HttpStart</code> | [HttpStart](./kibana-plugin-core-public.httpstart.md) |
|  [i18n](./kibana-plugin-core-public.corestart.i18n.md) | <code>I18nStart</code> | [I18nStart](./kibana-plugin-core-public.i18nstart.md) |
|  [injectedMetadata](./kibana-plugin-core-public.corestart.injectedmetadata.md) | <code>{</code><br/><code>        getInjectedVar: (name: string, defaultValue?: any) =&gt; unknown;</code><br/><code>    }</code> | exposed temporarily until https://github.com/elastic/kibana/issues/41990 done use \*only\* to retrieve config values. There is no way to set injected values in the new platform. |
|  [notifications](./kibana-plugin-core-public.corestart.notifications.md) | <code>NotificationsStart</code> | [NotificationsStart](./kibana-plugin-core-public.notificationsstart.md) |
|  [overlays](./kibana-plugin-core-public.corestart.overlays.md) | <code>OverlayStart</code> | [OverlayStart](./kibana-plugin-core-public.overlaystart.md) |
|  [savedObjects](./kibana-plugin-core-public.corestart.savedobjects.md) | <code>SavedObjectsStart</code> | [SavedObjectsStart](./kibana-plugin-core-public.savedobjectsstart.md) |
|  [uiSettings](./kibana-plugin-core-public.corestart.uisettings.md) | <code>IUiSettingsClient</code> | [IUiSettingsClient](./kibana-plugin-core-public.iuisettingsclient.md) |

