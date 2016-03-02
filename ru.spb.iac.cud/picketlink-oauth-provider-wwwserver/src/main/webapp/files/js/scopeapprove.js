	$(document).ready(function() {
		if (!$('#approve')) {
			return;
		}		// , 
		$('#approve').click(function() {
			//debugger;
			var jqxhr = $.ajax('/picketlink-oauth-provider-wwwserver/auth/scope', {
				contentType: L_JSON_CONTENT_TYPE,
				dataType:'json',
				data:JSON.stringify({state:$('#state').val(),client_id:$('#client_id').val(),scope:$('#scope').val(),response_type:$('#response_type').val()}),
				type:'POST', 
				success:function (data) {
					//debugger;					
					if (data.error) {
						frmApprove.error.value = data.error;
						frmApprove.error_description.value = data.error_description;
						frmApprove.action = data.error_uri || "#";
					} else {
						frmApprove.code.value = data.code;
						frmApprove.state.value = data.state;
					}
					frmApprove.submit();
				}
			});
			return false; // prevents submit of the form
		});
	});	