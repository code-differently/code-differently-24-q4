var themeBtn = document.getElementById("theme-btn");
var themeImg = document.getElementById("theme-img");
let theme = "dark";

// Grabbed from https://www.w3schools.com/css/css3_variables_javascript.asp
var r = document.querySelector(":root");
var rs = getComputedStyle(r);

console.log(r);
console.log(rs);

themeBtn.addEventListener("click", (e) => {
  if (theme.includes("dark")) {
    r.style.setProperty(
      "--bg-color",
      rs.getPropertyValue("--light-mode-bg-color")
    );
    r.style.setProperty(
      "--line-sep-color",
      rs.getPropertyValue("--light-mode-line-sep-color")
    );
    r.style.setProperty(
      "--card-border",
      rs.getPropertyValue("--light-mode-card-border")
    );
    r.style.setProperty(
      "--theme-btn-color",
      rs.getPropertyValue("--light-mode-theme-btn-color")
    );
    r.style.setProperty(
      "--text-color",
      rs.getPropertyValue("--light-mode-text-color")
    );
    theme = "light";
    themeImg.setAttribute("src", "icons/" + theme + ".png");
  } else {
    r.style.setProperty(
      "--bg-color",
      rs.getPropertyValue("--dark-mode-bg-color")
    );
    r.style.setProperty(
      "--line-sep-color",
      rs.getPropertyValue("--dark-mode-line-sep-color")
    );
    r.style.setProperty(
      "--card-border",
      rs.getPropertyValue("--dark-mode-card-border")
    );
    r.style.setProperty(
      "--theme-btn-color",
      rs.getPropertyValue("--dark-mode-theme-btn-color")
    );
    r.style.setProperty(
      "--text-color",
      rs.getPropertyValue("--dark-mode-text-color")
    );
    theme = "dark";
    themeImg.setAttribute("src", "icons/" + theme + ".png");
  }
});
