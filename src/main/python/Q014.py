# Script to generate a PDF report after data has been parsed into simInfo.csv file

# import statements
from reportlab.lib.pagesizes import letter
from reportlab.pdfgen import canvas
from reportlab.lib.pagesizes import portrait
import csv
import datetime
now = datetime.datetime.now()

data_file = 'smsInfo.csv'

# Function for importing data
def import_Data(data_file):
    textMessageinfo = csv.reader(open(data_file, "r"))
    for row in textMessageinfo:
        _id = row[0]
        incoming_number = row[1]
        date_and_time = row[2]
        read = row[3]
        sent_replied = row[4]
        body = row[5]
        seen = row[6]
        pdf_filename = _id + incoming_number + date_and_time + read + sent_replied + body + seen + '.pdf'
        generate_report(_id, incoming_number, date_and_time, read, sent_replied, body, seen, pdf_filename)


def generate_report(_id, incoming_number, date_and_time, read, sent_replied, body, seen, pdf_filename):

    smsdata = _id, incoming_number, date_and_time, read, sent_replied, body, seen
    canvas.drawString(50,100, smsdata)
    canvas.showPage()

    import_Data(data_file)


print("Forensic Report Generated!")


def main():
    # PDF document layout
    canvas = canvas.Canvas("H:\College Fourth Year\Development Project\Final Year Project 2018\Forensic Reports\SMS Report.pdf", pagesize=letter)

    canvas.setLineWidth(.3)
    canvas.setFont('Helvetica', 12)
    canvas.drawString(30,750,'LYIT MOBILE FORENSICS DIVISION')
    canvas.drawString(500,750,"Date: " + now.strftime("%d-%m-%y")) # Prints date of the report(on the fly)
    canvas.line(500,747,595,747)
    canvas.drawString(500,725,'Case Number:')
    canvas.drawString(580,725,"10")
    canvas.line(500,723,595,723)

    # Introduction text
    line1 = 'This forensic report on sms data has been compiled by the forensic'
    line2 = 'examiner in conclusion to the investigation into the RTA'
    line3 = 'case which occurred on the 23/01/2018.'
    textObject = canvas.beginText(30, 700)
    lines = [line1, line2, line3]
    for line in lines:
        textObject.textLine(line)
    canvas.drawText(textObject)

    canvas.save()



if __name__ == '__main__':
    main()