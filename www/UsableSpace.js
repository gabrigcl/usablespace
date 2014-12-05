var UsableSpace = {

	    getUsableSpace: function(successCallback, errorCallback) {
	        cordova.exec(
	            successCallback, // success callback function
	            errorCallback, // error callback function
	            'UsableSpace', // mapped to our native Java class called "UsableSpace"
	            'getUsableSpace', // with this action name
	            []
	        ); 
	     }

}

module.exports = UsableSpace;
