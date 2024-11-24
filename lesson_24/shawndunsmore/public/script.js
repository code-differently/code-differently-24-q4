async function submitForm(event) {
event.preventDefault(); 
const fname = document.getElementById('fname').value;
const lname = document.getElementById('lname').value;
const email = document.getElementById('email').value;
const message = document.getElementById('message').value;

try {
        const response = await fetch('/contact', {
        method: 'POST',
        headers: { 'Content-Type': 'application/x-www-form-urlencoded' },
        body: new URLSearchParams({ fname, lname, email, message }), 
        });

        const responseText = await response.text(); 
        document.getElementById('responseDiv').innerText = responseText;
    } catch (error) {
        console.error('Error:', error);
        document.getElementById('responseDiv').innerText = 'An error occurred while sending the request.';
    }
}