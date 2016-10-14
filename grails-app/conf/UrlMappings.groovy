class UrlMappings {

	static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }
        //Bonuses URIs
        "/persona/$id"(controller: "persona", parseRequest: true) {
            action = [GET: 'getPersona']
        }
        "/persona/all"(controller: "persona", parseRequest: true) {
            action = [GET: 'getAllPersonas']
        }


        "/"(view:"/index")
        "500"(view:'/error')
	}
}
