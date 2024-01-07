// Sửa nội dung cho các thẻ <tr>
const tableRows = document.querySelectorAll("table tr");
for (let i = 1; i < tableRows.length; i++) {
    const row = tableRows[i];
    const snCell = row.cells[0];
    snCell.textContent = i;
}
