function submitForm() {
    const form = document.getElementById("surveyForm");

    if (form.checkValidity()) {
        const firstName = document.getElementById("firstName").value;
        const lastName = document.getElementById("lastName").value;
        const dob = document.getElementById("dob").value;
        const country = document.getElementById("country").value;
        const genderElements = document.getElementsByName("gender");
        const gender = Array.from(genderElements).filter(el => el.checked).map(el => el.value).join(", ");
        const profession = document.getElementById("profession").value;
        const email = document.getElementById("email").value;
        const mobile = document.getElementById("mobile").value;

        const resultContent = document.getElementById("resultContent");
        resultContent.innerHTML = `
            <p><strong>First Name:</strong> ${firstName}</p>
            <p><strong>Last Name:</strong> ${lastName}</p>
            <p><strong>Date of Birth:</strong> ${dob}</p>
            <p><strong>Country:</strong> ${country}</p>
            <p><strong>Gender:</strong> ${gender}</p>
            <p><strong>Profession:</strong> ${profession}</p>
            <p><strong>Email:</strong> ${email}</p>
            <p><strong>Mobile Number:</strong> ${mobile}</p>
        `;

        document.getElementById("resultPopup").style.display = "block";
        form.reset();
    } else {
        alert("Please fill out all the required fields.");
    }
}

function resetForm() {
    document.getElementById("surveyForm").reset();
}

function closePopup() {
    document.getElementById("resultPopup").style.display = "none";
}
