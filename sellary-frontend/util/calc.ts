// 2025-12-31T00:00:00
export default function parseISOToString(dateString : string |null){
    if(dateString === null) return '';
    const date = new Date(dateString);
    console.log(date)
    return `${date.getFullYear()}년 ${date.getMonth()+1}월 ${date.getDate()}일 ${date.getHours()}시 ${date.getMinutes()}분`
}