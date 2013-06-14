function getFacultyMemberCourses(facultyMemberId) {
	window.location = "manageCourseAllocations.bnu?f=" + facultyMemberId;
}

function getFacultyMemberCoursesByAJAX(facultyMemberId) {
	var url = "facultyMemberCourses.bnu?f=" + facultyMemberId;
	$.get(url, function(data) {
		alert(data);
		//$("#facultyCourses").html(data);
		document.getElementById("facultyCourses").innerHTML = data;
	});
}

function getRegisterMemberCoursesByAJAX(allocationId) {
	var url = "RegisterCourses.bnu?f=" + allocationId;
	$.get(url, function(data) {
		
		//$("#facultyCourses").html(data);
		document.getElementById("courseRegister").innerHTML = data;
	});
}