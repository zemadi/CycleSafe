import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_nationalCivicDay_locationindex_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/location/index.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',5,['gsp_sm_xmlClosingForEmptyTag':(""),'charset':("utf-8")],-1)
printHtmlPart(1)
createTagBody(2, {->
createClosureForHtmlPart(2, 3)
invokeTag('captureTitle','sitemesh',6,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',6,[:],2)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',7,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("viewport"),'content':("width=device-width, initial-scale=1.0")],-1)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',8,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("description"),'content':("")],-1)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',9,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("author"),'content':("")],-1)
printHtmlPart(3)
})
invokeTag('captureHead','sitemesh',19,[:],1)
printHtmlPart(4)
createTagBody(1, {->
printHtmlPart(5)
for( item in (location) ) {
printHtmlPart(6)
expressionOut.print(item)
printHtmlPart(7)
invokeTag('hiddenField','g',243,['name':("myField"),'value':(item),'id':("xLoc")],-1)
printHtmlPart(8)
}
printHtmlPart(4)
createClosureForHtmlPart(9, 2)
invokeTag('textField','g',246,['name':("TEMPORARY"),'value':("TEMP"),'id':("LOCX")],2)
printHtmlPart(8)
createClosureForHtmlPart(9, 2)
invokeTag('textField','g',247,['name':("TEMPORARY"),'value':("TEMP"),'id':("LOCY")],2)
printHtmlPart(10)
})
invokeTag('captureBody','sitemesh',270,['data-spy':("scroll"),'data-target':(".bs-docs-sidebar")],1)
printHtmlPart(11)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1401571875882L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
