// Chức năng cho sidebar

const sidebarLinks = document.querySelectorAll(".sidebar a");
for (let link of sidebarLinks) {
    link.addEventListener("click", function(e) {
        e.preventDefault();

        // Xóa class active khỏi tất cả các liên kết
        for (let otherLink of sidebarLinks) {
            otherLink.classList.remove("active");
        }

        // Thêm class active cho liên kết hiện tại
        this.classList.add("active");

        // Hiển thị nội dung tương ứng với liên kết
        const contentElement = document.querySelector(".content");
        contentElement.innerHTML = `<h1>${this.textContent}</h1>`;
    });
}

// Hiển thị nội dung mặc định
const defaultLink = document.querySelector(".sidebar a:first-child");
defaultLink.click();
