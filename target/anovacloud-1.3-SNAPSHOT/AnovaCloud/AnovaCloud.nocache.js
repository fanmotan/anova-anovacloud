function AnovaCloud(){var T='',Lb=' is not a valid formfactor and has been ignored.',Bb='" for "gwt:onLoadErrorFn"',zb='" for "gwt:onPropertyErrorFn"',mb='"><\/script>',bb='#',Hb='&',Ub='.cache.html',db='/',pb='//',Qb='95264C3AF609737A67B0DDD41D31D718',Tb=':',tb='::',ac='<script defer="defer">AnovaCloud.onInjectionDone(\'AnovaCloud\')<\/script>',lb='<script id="',wb='=',cb='?',Rb='AE27DCB92593B681A88FEE784082B93E',U='AnovaCloud',ib='AnovaCloud.nocache.js',sb='AnovaCloud::',yb='Bad handler "',Sb='D3710ED5858CDD2AB87D8E1DF9F7FFC2',_b='DOMContentLoaded',nb='SCRIPT',kb='__gwt_marker_AnovaCloud',ob='base',gb='baseUrl',X='begin',W='bootstrap',fb='clear.cache.gif',vb='content',Kb='desktop',ab='end',Mb='formfactor',Y='gwt.codesvr=',Z='gwt.hosted=',$='gwt.hybrid',Vb='gwt/standard/standard.css',Ab='gwt:onLoadErrorFn',xb='gwt:onPropertyErrorFn',ub='gwt:property',Gb='gwtp.formfactor',$b='head',Ob='hosted.html?AnovaCloud',Zb='href',Cb='iframe',eb='img',Db="javascript:''",Wb='link',Nb='loadExternalRefs',qb='meta',Ib='mobile',Fb='moduleRequested',_='moduleStartup',rb='name',Eb='position:absolute;width:0;height:0;border:none',Xb='rel',hb='script',Pb='selectingPermutation',V='startup',Yb='stylesheet',Jb='tablet',jb='undefined';var m=window,n=document,o=m.__gwtStatsEvent?function(a){return m.__gwtStatsEvent(a)}:null,p=m.__gwtStatsSessionId?m.__gwtStatsSessionId:null,q,r,s,t=T,u={},v=[],w=[],A=[],B=0,C,D;o&&o({moduleName:U,sessionId:p,subSystem:V,evtGroup:W,millis:(new Date).getTime(),type:X});if(!m.__gwt_stylesLoaded){m.__gwt_stylesLoaded={}}if(!m.__gwt_scriptsLoaded){m.__gwt_scriptsLoaded={}}function F(){var b=false;try{var c=m.location.search;return (c.indexOf(Y)!=-1||(c.indexOf(Z)!=-1||m.external&&m.external.gwtOnLoad))&&c.indexOf($)==-1}catch(a){}F=function(){return b};return b}
function G(){if(q&&r){var b=n.getElementById(U);var c=b.contentWindow;if(F()){c.__gwt_getProperty=function(a){return L(a)}}AnovaCloud=null;c.gwtOnLoad(C,U,t,B);o&&o({moduleName:U,sessionId:p,subSystem:V,evtGroup:_,millis:(new Date).getTime(),type:ab})}}
function H(){function e(a){var b=a.lastIndexOf(bb);if(b==-1){b=a.length}var c=a.indexOf(cb);if(c==-1){c=a.length}var d=a.lastIndexOf(db,Math.min(c,b));return d>=0?a.substring(0,d+1):T}
function f(a){if(a.match(/^\w+:\/\//)){}else{var b=n.createElement(eb);b.src=a+fb;a=e(b.src)}return a}
function g(){var a=J(gb);if(a!=null){return a}return T}
function h(){var a=n.getElementsByTagName(hb);for(var b=0;b<a.length;++b){if(a[b].src.indexOf(ib)!=-1){return e(a[b].src)}}return T}
function i(){var a;if(typeof isBodyLoaded==jb||!isBodyLoaded()){var b=kb;var c;n.write(lb+b+mb);c=n.getElementById(b);a=c&&c.previousSibling;while(a&&a.tagName!=nb){a=a.previousSibling}if(c){c.parentNode.removeChild(c)}if(a&&a.src){return e(a.src)}}return T}
function j(){var a=n.getElementsByTagName(ob);if(a.length>0){return a[a.length-1].href}return T}
function k(){var a=n.location;return a.href==a.protocol+pb+a.host+a.pathname+a.search+a.hash}
var l=g();if(l==T){l=h()}if(l==T){l=i()}if(l==T){l=j()}if(l==T&&k()){l=e(n.location.href)}l=f(l);t=l;return l}
function I(){var b=document.getElementsByTagName(qb);for(var c=0,d=b.length;c<d;++c){var e=b[c],f=e.getAttribute(rb),g;if(f){f=f.replace(sb,T);if(f.indexOf(tb)>=0){continue}if(f==ub){g=e.getAttribute(vb);if(g){var h,i=g.indexOf(wb);if(i>=0){f=g.substring(0,i);h=g.substring(i+1)}else{f=g;h=T}u[f]=h}}else if(f==xb){g=e.getAttribute(vb);if(g){try{D=eval(g)}catch(a){alert(yb+g+zb)}}}else if(f==Ab){g=e.getAttribute(vb);if(g){try{C=eval(g)}catch(a){alert(yb+g+Bb)}}}}}}
function J(a){var b=u[a];return b==null?null:b}
function K(a,b){var c=A;for(var d=0,e=a.length-1;d<e;++d){c=c[a[d]]||(c[a[d]]=[])}c[a[e]]=b}
function L(a){var b=w[a](),c=v[a];if(b in c){return b}var d=[];for(var e in c){d[c[e]]=e}if(D){D(a,d,b)}throw null}
var M;function N(){if(!M){M=true;var a=n.createElement(Cb);a.src=Db;a.id=U;a.style.cssText=Eb;a.tabIndex=-1;n.body.appendChild(a);o&&o({moduleName:U,sessionId:p,subSystem:V,evtGroup:_,millis:(new Date).getTime(),type:Fb});a.contentWindow.location.replace(t+P)}}
w[Gb]=function(){function g(a,b){if(b==T){return undefined}var c=a.indexOf(b);if(c>=0){var d=a.substring(c);var e=d.indexOf(wb)+1;var f=d.indexOf(Hb);if(f==-1){f=d.indexOf(bb);if(f==-1){f=d.length}}d=d.substring(e,f);if(d!=T){if([Ib,Jb,Kb].indexOf(d)>-1){return d}else{window.console&&console.log(d+Lb)}}}return undefined}
function h(a){var b=/(Mobi|DoCoMo|Mini|Puffin|Fennec|j2me|Palm|portalmmm|Symbian ?OS|BOLT|webOS|UP\.(Link|Browser)|MIDP|PSP|WP|SonyEricsson|Windows ?CE|Android 0|Novarra-Vision|Nokia|Vodafone|uZardWeb)/;var c=/(Silk-Accelerated|Pad|GT-P1000M|Xoom|SCH-I800)/;var d=/(Pad|Android|Kindle|Silk-Accelerated|nook|PlayBook)/;if(a.match(b)&&!a.match(c)){return Ib}else if(a.match(d)){return Jb}return Kb}
function i(a,b,c){var d=g(b.href,a);if(d==undefined){d=h(c.userAgent)}return d}
return i(Mb,location,navigator)};v[Gb]={desktop:0,mobile:1,tablet:2};AnovaCloud.onScriptLoad=function(){if(M){r=true;G()}};AnovaCloud.onInjectionDone=function(){q=true;o&&o({moduleName:U,sessionId:p,subSystem:V,evtGroup:Nb,millis:(new Date).getTime(),type:ab});G()};I();H();var O;var P;if(F()){if(m.external&&(m.external.initModule&&m.external.initModule(U))){m.location.reload();return}P=Ob;O=T}o&&o({moduleName:U,sessionId:p,subSystem:V,evtGroup:W,millis:(new Date).getTime(),type:Pb});if(!F()){try{K([Jb],Qb);K([Kb],Rb);K([Ib],Sb);O=A[L(Gb)];var Q=O.indexOf(Tb);if(Q!=-1){B=Number(O.substring(Q+1));O=O.substring(0,Q)}P=O+Ub}catch(a){return}}var R;function S(){if(!s){s=true;if(!__gwt_stylesLoaded[Vb]){var a=n.createElement(Wb);__gwt_stylesLoaded[Vb]=a;a.setAttribute(Xb,Yb);a.setAttribute(Zb,t+Vb);n.getElementsByTagName($b)[0].appendChild(a)}G();if(n.removeEventListener){n.removeEventListener(_b,S,false)}if(R){clearInterval(R)}}}
if(n.addEventListener){n.addEventListener(_b,function(){N();S()},false)}var R=setInterval(function(){if(/loaded|complete/.test(n.readyState)){N();S()}},50);o&&o({moduleName:U,sessionId:p,subSystem:V,evtGroup:W,millis:(new Date).getTime(),type:ab});o&&o({moduleName:U,sessionId:p,subSystem:V,evtGroup:Nb,millis:(new Date).getTime(),type:X});n.write(ac)}
AnovaCloud();