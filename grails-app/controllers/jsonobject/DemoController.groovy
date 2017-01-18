package jsonobject

import org.grails.web.json.JSONObject

class DemoController {

    def index() {
    	render "Generating org.grails.web.json.JSONObject for the map [id:1, tags:['tag13333', 'tag2231']] as the variable jsonObject1<br/><br/>"
		org.grails.web.json.JSONObject jsonObject1 = new JSONObject([id:1, tags:['tag13333', 'tag2231']])
		render "tags field is a ${jsonObject1?.get('tags').class.name}<br/><br/>"
		render "but then the string representation of the jsonobject is not represented as an array list"
		render "${jsonObject1.toString()}<br/><br/>"
		render "Generating org.grails.web.json.JSONObject for the string ${jsonObject1.toString()} as the variable jsonObject2<br/><br/>"
		org.grails.web.json.JSONObject jsonObject2 = new JSONObject(jsonObject1.toString())
		render "tags field is a ${jsonObject2?.get('tags').class.name}<br/><br/>"
    }
}
